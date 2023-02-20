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
public class TestMonths extends TestCase {static class __CLR4_4_1iyiiyile6ndpmz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24570);
        __CLR4_4_1iyiiyile6ndpmz.R.inc(24571);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24572);
        __CLR4_4_1iyiiyile6ndpmz.R.inc(24573);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1iyiiyile6ndpmz.R.inc(24575);try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24574);
    }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24576);
    }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24577);
    }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_months_int111() {__CLR4_4_1iyiiyile6ndpmz.R.globalSliceStart(getClass().getName(),24578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12at6uqiyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyiiyile6ndpmz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyiiyile6ndpmz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12at6uqiyq(){try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24578); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24579);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24580);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24581);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24582);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24583);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24584);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24585);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24586);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24587);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24588);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24589);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24590);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24591);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24592);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24593);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24594);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24595);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}
public void testFactory_parseMonths_String112() {__CLR4_4_1iyiiyile6ndpmz.R.globalSliceStart(getClass().getName(),24596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5lo1kiz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyiiyile6ndpmz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyiiyile6ndpmz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5lo1kiz8(){try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24596); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24597);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24598);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24599);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24600);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24601);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24602);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24603);try { 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24604);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24605);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24606);try { 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24607);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24608);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}
public void testFactory_monthsBetween_RPartial_YearMonth113() {__CLR4_4_1iyiiyile6ndpmz.R.globalSliceStart(getClass().getName(),24609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kuck6izl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iyiiyile6ndpmz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iyiiyile6ndpmz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kuck6izl(){try{__CLR4_4_1iyiiyile6ndpmz.R.inc(24609); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24610);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1iyiiyile6ndpmz.R.inc(24611);for (int i = 0; (((i < 6)&&(__CLR4_4_1iyiiyile6ndpmz.R.iget(24612)!=0|true))||(__CLR4_4_1iyiiyile6ndpmz.R.iget(24613)==0&false)); i++) {{ 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24614);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24615);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24616);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1iyiiyile6ndpmz.R.inc(24617);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1iyiiyile6ndpmz.R.flushNeeded();}}
    

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
