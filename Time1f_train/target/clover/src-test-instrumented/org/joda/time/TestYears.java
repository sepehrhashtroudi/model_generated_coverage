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
public class TestYears extends TestCase {static class __CLR4_4_1qsvqsvlc8axeno{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,34889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34735);
        __CLR4_4_1qsvqsvlc8axeno.R.inc(34736);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34737);
        __CLR4_4_1qsvqsvlc8axeno.R.inc(34738);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1qsvqsvlc8axeno.R.inc(34740);try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34739);
    }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34741);
    }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34742);
    }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_yearsBetween_RInstant22() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pa4sakqt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pa4sakqt3(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34743); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34744);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34745);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34746);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34747);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34748);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34749);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34750);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34751);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testFactory_yearsIn_RInterval164() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u10162qtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u10162qtc(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34752); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34753);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34754);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34755);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34756);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34757);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34758);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34759);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34760);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testMultipliedBy_int337() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1injiluqtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1injiluqtl(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34761); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34762);Years test = Years.years(2); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34763);assertEquals(6, test.multipliedBy(3).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34764);assertEquals(2, test.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34765);assertEquals(-6, test.multipliedBy(-3).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34766);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34767);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34768);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34769);halfMax.multipliedBy(2); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34770);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testIsGreaterThan738() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrk2akqtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan738",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrk2akqtv(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34771); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34772);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34773);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34774);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34775);assertEquals(true, Years.ONE.isGreaterThan(null)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34776);assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testToString742() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e271xaqu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e271xaqu1(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34777); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34778);Years test = Years.years(20); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34779);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34780);test = Years.years(-20); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34781);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testIsLessThan811() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r566o9qu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan811",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r566o9qu6(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34782); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34783);assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34784);assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34785);assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34786);assertEquals(false, Years.ONE.isLessThan(null)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34787);assertEquals(true, Years.years(-1).isLessThan(null)); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testSerialization875() throws Exception {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmv1sxquc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization875",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmv1sxquc() throws Exception{try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34788); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34789);Years test = Years.THREE; 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34790);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34791);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34792);oos.writeObject(test); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34793);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34794);oos.close(); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34795);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34796);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34797);Years result = (Years) ois.readObject(); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34798);ois.close(); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34799);assertSame(test, result); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testPlus_Years899() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5vx0kquo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years899",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5vx0kquo(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34800); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34801);Years test2 = Years.years(2); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34802);Years test3 = Years.years(3); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34803);Years result = test2.plus(test3); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34804);assertEquals(2, test2.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34805);assertEquals(3, test3.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34806);assertEquals(5, result.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34807);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34808);assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34809);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34810);Years.MAX_VALUE.plus(Years.ONE); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34811);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testGetFieldType914() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odf5w3qv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType914",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odf5w3qv0(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34812); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34813);Years test = Years.years(20); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34814);assertEquals(DurationFieldType.years(), test.getFieldType()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_yearsBetween_RPartial1126() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164lozkqv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial1126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164lozkqv3(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34815); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34816);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34817);LocalDate end1 = new LocalDate(2009, 6, 9); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34818);YearMonthDay end2 = new YearMonthDay(2012, 6, 9); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34819);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34820);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34821);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34822);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34823);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testGetPeriodType1205() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1taievoqvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType1205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1taievoqvc(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34824); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34825);Years test = Years.years(20); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34826);assertEquals(PeriodType.years(), test.getPeriodType()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testNegated1241() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4c045qvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4c045qvf(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34827); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34828);Years test = Years.years(12); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34829);assertEquals(-12, test.negated().getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34830);assertEquals(12, test.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34831);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34832);Years.MIN_VALUE.negated(); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34833);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testDividedBy_int1302() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11iwphxqvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int1302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11iwphxqvm(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34834); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34835);Years test = Years.years(12); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34836);assertEquals(6, test.dividedBy(2).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34837);assertEquals(12, test.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34838);assertEquals(4, test.dividedBy(3).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34839);assertEquals(3, test.dividedBy(4).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34840);assertEquals(2, test.dividedBy(5).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34841);assertEquals(2, test.dividedBy(6).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34842);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34843);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34844);Years.ONE.dividedBy(0); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34845);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testMinus_Years1364() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gziwfwqvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years1364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gziwfwqvy(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34846); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34847);Years test2 = Years.years(2); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34848);Years test3 = Years.years(3); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34849);Years result = test2.minus(test3); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34850);assertEquals(2, test2.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34851);assertEquals(3, test3.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34852);assertEquals(-1, result.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34853);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34854);assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34855);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34856);Years.MIN_VALUE.minus(Years.ONE); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34857);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testMinus_int1395() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1so5hzhqwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int1395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1so5hzhqwa(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34858); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34859);Years test2 = Years.years(2); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34860);Years result = test2.minus(3); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34861);assertEquals(2, test2.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34862);assertEquals(-1, result.getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34863);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34864);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34865);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34866);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testFactory_years_int1575() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ygng6wqwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int1575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ygng6wqwj(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34867); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34868);assertSame(Years.ZERO, Years.years(0)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34869);assertSame(Years.ONE, Years.years(1)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34870);assertSame(Years.TWO, Years.years(2)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34871);assertSame(Years.THREE, Years.years(3)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34872);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34873);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE)); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34874);assertEquals(-1, Years.years(-1).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34875);assertEquals(4, Years.years(4).getYears()); 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 


public void testFactory_parseYears_String1588() {__CLR4_4_1qsvqsvlc8axeno.R.globalSliceStart(getClass().getName(),34876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfq85tqws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qsvqsvlc8axeno.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qsvqsvlc8axeno.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String1588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfq85tqws(){try{__CLR4_4_1qsvqsvlc8axeno.R.inc(34876); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34877);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34878);assertEquals(0, Years.parseYears("P0Y").getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34879);assertEquals(1, Years.parseYears("P1Y").getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34880);assertEquals(-3, Years.parseYears("P-3Y").getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34881);assertEquals(2, Years.parseYears("P2Y0M").getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34882);assertEquals(2, Years.parseYears("P2YT0H0M").getYears()); 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34883);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34884);Years.parseYears("P1M1D"); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34885);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qsvqsvlc8axeno.R.inc(34886);try { 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34887);Years.parseYears("P1YT1H"); 
         __CLR4_4_1qsvqsvlc8axeno.R.inc(34888);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qsvqsvlc8axeno.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
