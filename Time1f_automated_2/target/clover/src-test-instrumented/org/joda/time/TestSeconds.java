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
public class TestSeconds extends TestCase {static class __CLR4_4_1jmljmlle6nl8gd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25437);
        __CLR4_4_1jmljmlle6nl8gd.R.inc(25438);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25439);
        __CLR4_4_1jmljmlle6nl8gd.R.inc(25440);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1jmljmlle6nl8gd.R.inc(25442);try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25441);
    }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25443);
    }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25444);
    }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSerialization226() throws Exception {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3tcldjmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3tcldjmt() throws Exception{try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25445); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25446);Seconds test = Seconds.THREE; 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25447);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25448);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25449);oos.writeObject(test); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25450);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25451);oos.close(); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25452);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25453);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25454);Seconds result = (Seconds) ois.readObject(); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25455);ois.close(); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25456);assertSame(test, result); 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
public void testFactory_secondsBetween_RInstant227() {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ievelcjn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ievelcjn5(){try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25457); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25458);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25459);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25460);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25461);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25462);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25463);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25464);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25465);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds()); 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
public void testToStandardWeeks228() {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ki8laujne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ki8laujne(){try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25466); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25467);Seconds test = Seconds.seconds(60 * 60 * 2); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25468);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25469);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
public void testMinus_int229() {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0kzrijni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0kzrijni(){try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25470); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25471);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25472);Seconds result = test2.minus(3); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25473);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25474);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25475);assertEquals(1, Seconds.ONE.minus(0).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25476);try { 
         __CLR4_4_1jmljmlle6nl8gd.R.inc(25477);Seconds.MIN_VALUE.minus(1); 
         __CLR4_4_1jmljmlle6nl8gd.R.inc(25478);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
public void testMinus_Seconds230() {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4b7agjnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4b7agjnr(){try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25479); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25480);Seconds test2 = Seconds.seconds(2); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25481);Seconds test3 = Seconds.seconds(3); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25482);Seconds result = test2.minus(test3); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25483);assertEquals(2, test2.getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25484);assertEquals(3, test3.getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25485);assertEquals(-1, result.getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25486);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25487);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds()); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25488);try { 
         __CLR4_4_1jmljmlle6nl8gd.R.inc(25489);Seconds.MIN_VALUE.minus(Seconds.ONE); 
         __CLR4_4_1jmljmlle6nl8gd.R.inc(25490);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
public void testIsLessThan231() {__CLR4_4_1jmljmlle6nl8gd.R.globalSliceStart(getClass().getName(),25491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scw2ypjo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jmljmlle6nl8gd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jmljmlle6nl8gd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scw2ypjo3(){try{__CLR4_4_1jmljmlle6nl8gd.R.inc(25491); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25492);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO)); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25493);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE)); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25494);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE)); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25495);assertEquals(false, Seconds.ONE.isLessThan(null)); 
     __CLR4_4_1jmljmlle6nl8gd.R.inc(25496);assertEquals(true, Seconds.seconds(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jmljmlle6nl8gd.R.flushNeeded();}}
    

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
