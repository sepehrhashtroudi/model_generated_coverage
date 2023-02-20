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
public class TestYears extends TestCase {static class __CLR4_4_1pcjpcjle6rcmdx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32851);
        __CLR4_4_1pcjpcjle6rcmdx.R.inc(32852);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32853);
        __CLR4_4_1pcjpcjle6rcmdx.R.inc(32854);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1pcjpcjle6rcmdx.R.inc(32856);try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32855);
    }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32857);
    }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32858);
    }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString679() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dylvzzpcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dylvzzpcr(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32859); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32860);Years test = Years.years(20); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32861);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32862);test = Years.years(-20); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32863);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testFactory_yearsBetween_RInstant680() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14n9fq8pcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14n9fq8pcw(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32864); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32865);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32866);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32867);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32868);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32869);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32870);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32871);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32872);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testFactory_parseYears_String681() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmfjaopd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String681",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmfjaopd5(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32873); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32874);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32875);assertEquals(0, Years.parseYears("P0Y").getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32876);assertEquals(1, Years.parseYears("P1Y").getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32877);assertEquals(-3, Years.parseYears("P-3Y").getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32878);assertEquals(2, Years.parseYears("P2Y0M").getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32879);assertEquals(2, Years.parseYears("P2YT0H0M").getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32880);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32881);Years.parseYears("P1M1D"); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32882);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32883);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32884);Years.parseYears("P1YT1H"); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32885);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testMultipliedBy_int682() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12j20tnpdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12j20tnpdi(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32886); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32887);Years test = Years.years(2); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32888);assertEquals(6, test.multipliedBy(3).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32889);assertEquals(2, test.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32890);assertEquals(-6, test.multipliedBy(-3).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32891);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32892);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32893);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32894);halfMax.multipliedBy(2); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32895);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testFactory_years_int683() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e3d15pds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e3d15pds(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32896); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32897);assertSame(Years.ZERO, Years.years(0)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32898);assertSame(Years.ONE, Years.years(1)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32899);assertSame(Years.TWO, Years.years(2)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32900);assertSame(Years.THREE, Years.years(3)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32901);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32902);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32903);assertEquals(-1, Years.years(-1).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32904);assertEquals(4, Years.years(4).getYears()); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_yearsBetween_RPartial684() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16nitx8pe1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16nitx8pe1(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32905); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32906);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32907);LocalDate end1 = new LocalDate(2009, 6, 9); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32908);YearMonthDay end2 = new YearMonthDay(2012, 6, 9); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32909);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32910);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32911);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32912);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32913);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testMinus_int686() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1522cabpea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1522cabpea(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32914); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32915);Years test2 = Years.years(2); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32916);Years result = test2.minus(3); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32917);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32918);assertEquals(-1, result.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32919);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32920);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32921);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32922);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testMinus_Years687() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9nhd3pej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9nhd3pej(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32923); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32924);Years test2 = Years.years(2); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32925);Years test3 = Years.years(3); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32926);Years result = test2.minus(test3); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32927);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32928);assertEquals(3, test3.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32929);assertEquals(-1, result.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32930);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32931);assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32932);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32933);Years.MIN_VALUE.minus(Years.ONE); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32934);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testDividedBy_int688() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4ugn1pev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int688",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4ugn1pev(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32935); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32936);Years test = Years.years(12); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32937);assertEquals(6, test.dividedBy(2).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32938);assertEquals(12, test.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32939);assertEquals(4, test.dividedBy(3).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32940);assertEquals(3, test.dividedBy(4).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32941);assertEquals(2, test.dividedBy(5).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32942);assertEquals(2, test.dividedBy(6).getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32943);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32944);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32945);Years.ONE.dividedBy(0); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32946);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testNegated689() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5h7jipf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated689",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5h7jipf7(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32947); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32948);Years test = Years.years(12); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32949);assertEquals(-12, test.negated().getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32950);assertEquals(12, test.getYears()); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32951);try { 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32952);Years.MIN_VALUE.negated(); 
         __CLR4_4_1pcjpcjle6rcmdx.R.inc(32953);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testIsGreaterThan690() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15drsgbpfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan690",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15drsgbpfe(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32954); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32955);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32956);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32957);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32958);assertEquals(true, Years.ONE.isGreaterThan(null)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32959);assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 


public void testIsLessThan691() {__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceStart(getClass().getName(),32960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eypf5tpfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pcjpcjle6rcmdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pcjpcjle6rcmdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eypf5tpfk(){try{__CLR4_4_1pcjpcjle6rcmdx.R.inc(32960); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32961);assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32962);assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32963);assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32964);assertEquals(false, Years.ONE.isLessThan(null)); 
     __CLR4_4_1pcjpcjle6rcmdx.R.inc(32965);assertEquals(true, Years.years(-1).isLessThan(null)); 
 }finally{__CLR4_4_1pcjpcjle6rcmdx.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
