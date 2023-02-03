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
public class TestMonths extends TestCase {static class __CLR4_4_1hxphxplccietpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hxphxplccietpb.R.inc(23245);
        __CLR4_4_1hxphxplccietpb.R.inc(23246);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hxphxplccietpb.R.inc(23247);
        __CLR4_4_1hxphxplccietpb.R.inc(23248);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1hxphxplccietpb.R.inc(23250);try{__CLR4_4_1hxphxplccietpb.R.inc(23249);
    }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hxphxplccietpb.R.inc(23251);
    }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hxphxplccietpb.R.inc(23252);
    }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_parseMonths_String43() {__CLR4_4_1hxphxplccietpb.R.globalSliceStart(getClass().getName(),23253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbypsnhxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxphxplccietpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxphxplccietpb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbypsnhxx(){try{__CLR4_4_1hxphxplccietpb.R.inc(23253); 
     __CLR4_4_1hxphxplccietpb.R.inc(23254);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23255);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23256);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23257);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23258);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23259);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23260);try { 
         __CLR4_4_1hxphxplccietpb.R.inc(23261);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1hxphxplccietpb.R.inc(23262);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hxphxplccietpb.R.inc(23263);try { 
         __CLR4_4_1hxphxplccietpb.R.inc(23264);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1hxphxplccietpb.R.inc(23265);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}
public void testSerialization51() throws Exception {__CLR4_4_1hxphxplccietpb.R.globalSliceStart(getClass().getName(),23266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13oeq1rhya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxphxplccietpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxphxplccietpb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13oeq1rhya() throws Exception{try{__CLR4_4_1hxphxplccietpb.R.inc(23266); 
     __CLR4_4_1hxphxplccietpb.R.inc(23267);Months test = Months.THREE; 
     __CLR4_4_1hxphxplccietpb.R.inc(23268);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hxphxplccietpb.R.inc(23269);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hxphxplccietpb.R.inc(23270);oos.writeObject(test); 
     __CLR4_4_1hxphxplccietpb.R.inc(23271);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hxphxplccietpb.R.inc(23272);oos.close(); 
     __CLR4_4_1hxphxplccietpb.R.inc(23273);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hxphxplccietpb.R.inc(23274);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hxphxplccietpb.R.inc(23275);Months result = (Months) ois.readObject(); 
     __CLR4_4_1hxphxplccietpb.R.inc(23276);ois.close(); 
     __CLR4_4_1hxphxplccietpb.R.inc(23277);assertSame(test, result); 
 }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}
public void testPlus_Months55() {__CLR4_4_1hxphxplccietpb.R.globalSliceStart(getClass().getName(),23278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13dcj65hym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxphxplccietpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxphxplccietpb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13dcj65hym(){try{__CLR4_4_1hxphxplccietpb.R.inc(23278); 
     __CLR4_4_1hxphxplccietpb.R.inc(23279);Months test2 = Months.months(2); 
     __CLR4_4_1hxphxplccietpb.R.inc(23280);Months test3 = Months.months(3); 
     __CLR4_4_1hxphxplccietpb.R.inc(23281);Months result = test2.plus(test3); 
     __CLR4_4_1hxphxplccietpb.R.inc(23282);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23283);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23284);assertEquals(5, result.getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23285);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23286);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23287);try { 
         __CLR4_4_1hxphxplccietpb.R.inc(23288);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1hxphxplccietpb.R.inc(23289);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}
public void testFactory_monthsIn_RInterval264() {__CLR4_4_1hxphxplccietpb.R.globalSliceStart(getClass().getName(),23290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfjc74hyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxphxplccietpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxphxplccietpb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsIn_RInterval264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfjc74hyy(){try{__CLR4_4_1hxphxplccietpb.R.inc(23290); 
     __CLR4_4_1hxphxplccietpb.R.inc(23291);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1hxphxplccietpb.R.inc(23292);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1hxphxplccietpb.R.inc(23293);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1hxphxplccietpb.R.inc(23294);assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23295);assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23296);assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23297);assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23298);assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); 
 }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}
public void testFactory_months_int286() {__CLR4_4_1hxphxplccietpb.R.globalSliceStart(getClass().getName(),23299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16r043xhz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hxphxplccietpb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hxphxplccietpb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16r043xhz7(){try{__CLR4_4_1hxphxplccietpb.R.inc(23299); 
     __CLR4_4_1hxphxplccietpb.R.inc(23300);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23301);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23302);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23303);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23304);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23305);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23306);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23307);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23308);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23309);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23310);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1hxphxplccietpb.R.inc(23311);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1hxphxplccietpb.R.inc(23312);assertEquals(4, Months.months(4).getMonths()); 
 }finally{__CLR4_4_1hxphxplccietpb.R.flushNeeded();}}
    

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
