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
public class TestYears extends TestCase {static class __CLR4_4_1k8sk8sle6nl8is{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26236);
        __CLR4_4_1k8sk8sle6nl8is.R.inc(26237);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26238);
        __CLR4_4_1k8sk8sle6nl8is.R.inc(26239);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1k8sk8sle6nl8is.R.inc(26241);try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26240);
    }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26242);
    }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26243);
    }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_parseYears_String281() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5uar0k90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5uar0k90(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26244); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26245);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26246);assertEquals(0, Years.parseYears("P0Y").getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26247);assertEquals(1, Years.parseYears("P1Y").getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26248);assertEquals(-3, Years.parseYears("P-3Y").getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26249);assertEquals(2, Years.parseYears("P2Y0M").getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26250);assertEquals(2, Years.parseYears("P2YT0H0M").getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26251);try { 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26252);Years.parseYears("P1M1D"); 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26253);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26254);try { 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26255);Years.parseYears("P1YT1H"); 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26256);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testMinus_int282() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19infzvk9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19infzvk9d(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26257); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26258);Years test2 = Years.years(2); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26259);Years result = test2.minus(3); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26260);assertEquals(2, test2.getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26261);assertEquals(-1, result.getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26262);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26263);try { 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26264);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26265);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testGetPeriodType283() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g25cgbk9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g25cgbk9m(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26266); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26267);Years test = Years.years(20); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26268);assertEquals(PeriodType.years(), test.getPeriodType()); 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testFactory_yearsBetween_RInstant284() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gw56w0k9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gw56w0k9p(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26269); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26270);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26271);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26272);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26273);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26274);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26275);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26276);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26277);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testNegated288() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfw07dk9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfw07dk9y(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26278); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26279);Years test = Years.years(12); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26280);assertEquals(-12, test.negated().getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26281);assertEquals(12, test.getYears()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26282);try { 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26283);Years.MIN_VALUE.negated(); 
         __CLR4_4_1k8sk8sle6nl8is.R.inc(26284);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testIsGreaterThan289() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12orrkrka5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12orrkrka5(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26285); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26286);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26287);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26288);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26289);assertEquals(true, Years.ONE.isGreaterThan(null)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26290);assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testIsLessThan290() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oamhykab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oamhykab(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26291); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26292);assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26293);assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26294);assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26295);assertEquals(false, Years.ONE.isLessThan(null)); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26296);assertEquals(true, Years.years(-1).isLessThan(null)); 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
public void testToString291() {__CLR4_4_1k8sk8sle6nl8is.R.globalSliceStart(getClass().getName(),26297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0iy7nkah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8sk8sle6nl8is.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8sk8sle6nl8is.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0iy7nkah(){try{__CLR4_4_1k8sk8sle6nl8is.R.inc(26297); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26298);Years test = Years.years(20); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26299);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26300);test = Years.years(-20); 
     __CLR4_4_1k8sk8sle6nl8is.R.inc(26301);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1k8sk8sle6nl8is.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
