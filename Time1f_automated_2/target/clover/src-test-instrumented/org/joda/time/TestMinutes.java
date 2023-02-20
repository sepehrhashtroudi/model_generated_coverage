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
public class TestMinutes extends TestCase {static class __CLR4_4_1ibjibjle6nl8b7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23743);
        __CLR4_4_1ibjibjle6nl8b7.R.inc(23744);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23745);
        __CLR4_4_1ibjibjle6nl8b7.R.inc(23746);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1ibjibjle6nl8b7.R.inc(23748);try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23747);
    }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23749);
    }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23750);
    }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsLessThan381() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wr3sv1ibr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wr3sv1ibr(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23751); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23752);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23753);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23754);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23755);assertEquals(false, Minutes.ONE.isLessThan(null)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23756);assertEquals(true, Minutes.minutes(-1).isLessThan(null)); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testMinus_int382() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bni4uyibx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bni4uyibx(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23757); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23758);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23759);Minutes result = test2.minus(3); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23760);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23761);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23762);assertEquals(1, Minutes.ONE.minus(0).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23763);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23764);Minutes.MIN_VALUE.minus(1); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23765);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testFactory_minutes_int383() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzaq5ic6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzaq5ic6(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23766); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23767);assertSame(Minutes.ZERO, Minutes.minutes(0)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23768);assertSame(Minutes.ONE, Minutes.minutes(1)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23769);assertSame(Minutes.TWO, Minutes.minutes(2)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23770);assertSame(Minutes.THREE, Minutes.minutes(3)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23771);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23772);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23773);assertEquals(-1, Minutes.minutes(-1).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23774);assertEquals(4, Minutes.minutes(4).getMinutes()); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testFactory_minutesBetween_RPartial384() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grf8woicf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grf8woicf(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23775); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23776);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23777);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23778);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23779);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23780);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23781);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23782);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23783);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testFactory_parseMinutes_String385() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obpn46ico();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obpn46ico(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23784); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23785);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23786);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23787);assertEquals(1, Minutes.parseMinutes("PT1S").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23788);assertEquals(-3, Minutes.parseMinutes("PT-3S").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23789);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2S").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23790);assertEquals(2, Minutes.parseMinutes("PT0H2S").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23791);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23792);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23793);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23794);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23795);Minutes.parseMinutes("P1DT1S"); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23796);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testFactory_parseMinutes_String386() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2pobpid1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2pobpid1(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23797); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23798);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23799);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23800);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23801);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23802);assertEquals(2, Minutes.parseMinutes("P0Y2M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23803);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23804);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23805);Minutes.parseMinutes("P1Y1D"); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23806);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23807);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23808);Minutes.parseMinutes("P1DT1H"); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23809);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testFactory_minutesBetween_RPartial387() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qif5a3ide();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qif5a3ide(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23810); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23811);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23812);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23813);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23814);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23815);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23816);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23817);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23818);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testGetFieldType388() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwwpvaidn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetFieldType388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwwpvaidn(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23819); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23820);Minutes test = Minutes.minutes(20); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23821);assertEquals(DurationFieldType.minutes(), test.getFieldType()); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testToStandardWeeks389() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gutzxiidq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gutzxiidq(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23822); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23823);Minutes test = Minutes.minutes(3 * 7 * 2); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23824);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23825);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
public void testMinus_Minutes390() {__CLR4_4_1ibjibjle6nl8b7.R.globalSliceStart(getClass().getName(),23826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jm13nidu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ibjibjle6nl8b7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ibjibjle6nl8b7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jm13nidu(){try{__CLR4_4_1ibjibjle6nl8b7.R.inc(23826); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23827);Minutes test2 = Minutes.minutes(2); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23828);Minutes test3 = Minutes.minutes(3); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23829);Minutes result = test2.minus(test3); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23830);assertEquals(2, test2.getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23831);assertEquals(3, test3.getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23832);assertEquals(-1, result.getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23833);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23834);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); 
     __CLR4_4_1ibjibjle6nl8b7.R.inc(23835);try { 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23836);Minutes.MIN_VALUE.minus(Minutes.ONE); 
         __CLR4_4_1ibjibjle6nl8b7.R.inc(23837);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ibjibjle6nl8b7.R.flushNeeded();}}
    

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
