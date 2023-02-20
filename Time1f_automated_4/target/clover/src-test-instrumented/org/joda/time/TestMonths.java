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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {static class __CLR4_4_1ioziozle6o79vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ioziozle6o79vz.R.inc(24227);
        __CLR4_4_1ioziozle6o79vz.R.inc(24228);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ioziozle6o79vz.R.inc(24229);
        __CLR4_4_1ioziozle6o79vz.R.inc(24230);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1ioziozle6o79vz.R.inc(24232);try{__CLR4_4_1ioziozle6o79vz.R.inc(24231);
    }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ioziozle6o79vz.R.inc(24233);
    }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ioziozle6o79vz.R.inc(24234);
    }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_months_int130() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h57ej9ip7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h57ej9ip7(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24235); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24236);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24237);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24238);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24239);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24240);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24241);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24242);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24243);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24244);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24245);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24246);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24247);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24248);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24249);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24250);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24251);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24252);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
public void testFactory_monthsBetween_RInstant131() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c12d5iipp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c12d5iipp(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24253); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24254);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24255);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24256);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24257);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24258);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24259);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24260);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24261);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
public void testFactory_monthsBetween_RPartial_YearMonth132() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9jv4dipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9jv4dipy(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24262); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24263);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24264);for (int i = 0; (((i < 6)&&(__CLR4_4_1ioziozle6o79vz.R.iget(24265)!=0|true))||(__CLR4_4_1ioziozle6o79vz.R.iget(24266)==0&false)); i++) {{ 
         __CLR4_4_1ioziozle6o79vz.R.inc(24267);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1ioziozle6o79vz.R.inc(24268);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1ioziozle6o79vz.R.inc(24269);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1ioziozle6o79vz.R.inc(24270);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
public void testFactory_monthsIn_RInterval133() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6xem9iq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6xem9iq7(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24271); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24272);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24273);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24274);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24275);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24276);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24277);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24278);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24279);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); 
 }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
public void testNegated134() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybkuviqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybkuviqg(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24280); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24281);Months test = Months.months(12); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24282);assertEquals(-12, test.negated().getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24283);assertEquals(12, test.getMonths()); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24284);try { 
         __CLR4_4_1ioziozle6o79vz.R.inc(24285);Months.MIN_VALUE.negated(); 
         __CLR4_4_1ioziozle6o79vz.R.inc(24286);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
public void testIsGreaterThan135() {__CLR4_4_1ioziozle6o79vz.R.globalSliceStart(getClass().getName(),24287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epfthhiqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ioziozle6o79vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ioziozle6o79vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epfthhiqn(){try{__CLR4_4_1ioziozle6o79vz.R.inc(24287); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24288);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24289);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24290);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24291);assertEquals(true, Months.ONE.isGreaterThan(null)); 
     __CLR4_4_1ioziozle6o79vz.R.inc(24292);assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1ioziozle6o79vz.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-------------------------------------------------------------------------
    

    

    

    //-------------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
