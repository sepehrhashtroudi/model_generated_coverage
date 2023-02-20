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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes extends TestCase {static class __CLR4_4_1ispisple6ndpmc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24433,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ispisple6ndpmc.R.inc(24361);
        __CLR4_4_1ispisple6ndpmc.R.inc(24362);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ispisple6ndpmc.R.inc(24363);
        __CLR4_4_1ispisple6ndpmc.R.inc(24364);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1ispisple6ndpmc.R.inc(24366);try{__CLR4_4_1ispisple6ndpmc.R.inc(24365);
    }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ispisple6ndpmc.R.inc(24367);
    }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ispisple6ndpmc.R.inc(24368);
    }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToStandardMinutes319() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2bz0tisx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardMinutes319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2bz0tisx(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24369); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24370);Duration test = new Duration(0L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24371);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24372);test = new Duration(1L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24373);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24374);test = new Duration(60000L - 1); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24375);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24376);test = new Duration(60000L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24377);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24378);test = new Duration(60000L + 1); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24379);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24380);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24381);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24382);test = new Duration(2 * 60000L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24383);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24384);test = new Duration(-1L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24385);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24386);test = new Duration(-60000L + 1); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24387);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24388);test = new Duration(-60000L); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24389);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
public void testFactory_minutesIn_RInterval430() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rubk1piti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rubk1piti(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24390); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24391);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24392);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24393);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24394);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24395);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24396);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24397);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24398);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
public void testFactory_minutesBetween_RPartial431() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nhr39itr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nhr39itr(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24399); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24400);LocalTime start = new LocalTime(12, 3); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24401);LocalTime end1 = new LocalTime(12, 6); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24402);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 9); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24403);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24404);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24405);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24406);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24407);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
public void testToStandardDuration432() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15yxe0siu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15yxe0siu0(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24408); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24409);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24410);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24411);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24412);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24413);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
public void testDividedBy_int433() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diecliu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diecliu6(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24414); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24415);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24416);assertEquals(6, test.dividedBy(2).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24417);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24418);assertEquals(4, test.dividedBy(3).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24419);assertEquals(3, test.dividedBy(4).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24420);assertEquals(2, test.dividedBy(5).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24421);assertEquals(2, test.dividedBy(6).getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24422);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24423);try { 
         __CLR4_4_1ispisple6ndpmc.R.inc(24424);Minutes.ONE.dividedBy(0); 
         __CLR4_4_1ispisple6ndpmc.R.inc(24425);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
public void testNegated434() {__CLR4_4_1ispisple6ndpmc.R.globalSliceStart(getClass().getName(),24426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cvng4iui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ispisple6ndpmc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ispisple6ndpmc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cvng4iui(){try{__CLR4_4_1ispisple6ndpmc.R.inc(24426); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24427);Minutes test = Minutes.minutes(12); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24428);assertEquals(-12, test.negated().getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24429);assertEquals(12, test.getMinutes()); 
     __CLR4_4_1ispisple6ndpmc.R.inc(24430);try { 
         __CLR4_4_1ispisple6ndpmc.R.inc(24431);Minutes.MIN_VALUE.negated(); 
         __CLR4_4_1ispisple6ndpmc.R.inc(24432);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ispisple6ndpmc.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
