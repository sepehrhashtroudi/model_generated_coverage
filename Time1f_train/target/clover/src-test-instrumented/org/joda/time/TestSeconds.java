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
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds extends TestCase {static class __CLR4_4_1pb1pb1lc8axehc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,32986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32797);
        __CLR4_4_1pb1pb1lc8axehc.R.inc(32798);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32799);
        __CLR4_4_1pb1pb1lc8axehc.R.inc(32800);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1pb1pb1lc8axehc.R.inc(32802);try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32801);
    }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32803);
    }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32804);
    }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization173() throws Exception {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6w5capb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6w5capb9() throws Exception{try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32805); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32806);Seconds test = Seconds.THREE; 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32807);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32808);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32809);oos.writeObject(test); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32810);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32811);oos.close(); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32812);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32813);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32814);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32815);ois.close(); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32816);assertSame(test, result); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_parseSeconds_String211() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3esfwpbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3esfwpbl(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32817); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32818);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32819);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32820);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32821);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32822);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32823);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32824);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32825);Seconds.parseSeconds("P1Y1D"); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32826);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32827);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32828);Seconds.parseSeconds("P1DT1S"); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32829);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testToStandardMinutes370() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s29l7ipby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s29l7ipby(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32830); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32831);Seconds test = Seconds.seconds(60 * 2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32832);Minutes expected = Minutes.minutes(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32833);assertEquals(expected, test.toStandardMinutes()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testToStandardDuration417() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtbgv7pc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtbgv7pc2(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32834); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32835);Seconds test = Seconds.seconds(20); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32836);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32837);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32838);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32839);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testPlus_int430() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6uv9gpc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6uv9gpc8(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32840); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32841);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32842);Seconds result = test2.plus(3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32843);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32844);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32845);assertEquals(1, Seconds.ONE.plus(0).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32846);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32847);Seconds.MAX_VALUE.plus(1); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32848);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_secondsBetween_RPartial437() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17yz54vpch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17yz54vpch(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32849); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32850);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32851);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32852);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32853);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32854);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32855);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32856);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32857);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testDividedBy_int483() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165k0eupcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165k0eupcq(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32858); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32859);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32860);assertEquals(6, test.dividedBy(2).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32861);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32862);assertEquals(4, test.dividedBy(3).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32863);assertEquals(3, test.dividedBy(4).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32864);assertEquals(2, test.dividedBy(5).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32865);assertEquals(2, test.dividedBy(6).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32866);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32867);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32868);Seconds.ONE.dividedBy(0); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32869);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testIsGreaterThan651() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l20o4apd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan651",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l20o4apd2(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32870); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32871);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32872);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32873);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32874);assertEquals(true, Seconds.ONE.isGreaterThan(null)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32875);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testIsLessThan684() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxkfbxpd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxkfbxpd8(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32876); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32877);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32878);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32879);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32880);assertEquals(false, Seconds.ONE.isLessThan(null)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32881);assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testPlus_Seconds776() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dihdv5pde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds776",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dihdv5pde(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32882); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32883);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32884);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32885);Seconds result = test2.plus(test3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32886);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32887);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32888);assertEquals(5, result.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32889);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32890);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32891);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32892);Seconds.MAX_VALUE.plus(Seconds.ONE); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32893);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_secondsIn_RInterval865() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1im4a89pdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval865",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1im4a89pdq(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32894); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32895);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32896);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32897);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32898);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32899);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32900);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32901);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32902);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_standardSecondsIn_RPeriod956() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1si1k99pdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod956",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1si1k99pdz(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32903); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32904);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32905);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32906);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32907);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32908);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32909);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32910);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32911);Seconds.standardSecondsIn(Period.months(1)); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32912);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testToStandardDays1053() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqwq9npe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays1053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqwq9npe9(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32913); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32914);Seconds test = Seconds.seconds(60 * 60 * 24 * 2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32915);Days expected = Days.days(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32916);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testToStandardWeeks1097() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kptt3tped();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kptt3tped(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32917); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32918);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32919);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32920);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testMinus_Seconds1164() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ym3lqbpeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds1164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ym3lqbpeh(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32921); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32922);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32923);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32924);Seconds result = test2.minus(test3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32925);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32926);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32927);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32928);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32929);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32930);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32931);Seconds.MIN_VALUE.minus(Seconds.ONE); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32932);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testToStandardHours1255() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrf5t9pet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours1255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrf5t9pet(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32933); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32934);Seconds test = Seconds.seconds(60 * 60 * 2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32935);Hours expected = Hours.hours(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32936);assertEquals(expected, test.toStandardHours()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_seconds_int1287() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liwnkhpex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int1287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liwnkhpex(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32937); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32938);assertSame(Seconds.ZERO, Seconds.seconds(0)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32939);assertSame(Seconds.ONE, Seconds.seconds(1)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32940);assertSame(Seconds.TWO, Seconds.seconds(2)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32941);assertSame(Seconds.THREE, Seconds.seconds(3)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32942);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32943);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32944);assertEquals(-1, Seconds.seconds(-1).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32945);assertEquals(4, Seconds.seconds(4).getSeconds()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testMinus_int1293() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1aqpcpf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int1293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1aqpcpf6(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32946); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32947);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32948);Seconds result = test2.minus(3); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32949);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32950);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32951);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32952);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32953);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32954);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testFactory_secondsBetween_RInstant1407() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilvas1pff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant1407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilvas1pff(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32955); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32956);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32957);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32958);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32959);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32960);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32961);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32962);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32963);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testNegated1615() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jjjtspfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated1615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jjjtspfo(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32964); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32965);Seconds test = Seconds.seconds(12); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32966);assertEquals(-12, test.negated().getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32967);assertEquals(12, test.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32968);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32969);Seconds.MIN_VALUE.negated(); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32970);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testMultipliedBy_int1618() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyhy1rpfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int1618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyhy1rpfv(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32971); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32972);Seconds test = Seconds.seconds(2); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32973);assertEquals(6, test.multipliedBy(3).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32974);assertEquals(2, test.getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32975);assertEquals(-6, test.multipliedBy(-3).getSeconds()); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32976);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32977);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32978);try { 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32979);halfMax.multipliedBy(2); 
         __CLR4_4_1pb1pb1lc8axehc.R.inc(32980);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 


public void testAddToLocalDate1686() {__CLR4_4_1pb1pb1lc8axehc.R.globalSliceStart(getClass().getName(),32981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ya46xpg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pb1pb1lc8axehc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pb1pb1lc8axehc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate1686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ya46xpg5(){try{__CLR4_4_1pb1pb1lc8axehc.R.inc(32981); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32982);Seconds test = Seconds.seconds(26); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32983);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32984);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0); 
     __CLR4_4_1pb1pb1lc8axehc.R.inc(32985);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1pb1pb1lc8axehc.R.flushNeeded();}} 

    

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
