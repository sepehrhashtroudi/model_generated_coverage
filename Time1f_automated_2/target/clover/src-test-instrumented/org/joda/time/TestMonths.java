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
public class TestMonths extends TestCase {static class __CLR4_4_1iiziizle6nl8bq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1iiziizle6nl8bq.R.inc(24011);
        __CLR4_4_1iiziizle6nl8bq.R.inc(24012);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iiziizle6nl8bq.R.inc(24013);
        __CLR4_4_1iiziizle6nl8bq.R.inc(24014);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1iiziizle6nl8bq.R.inc(24016);try{__CLR4_4_1iiziizle6nl8bq.R.inc(24015);
    }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iiziizle6nl8bq.R.inc(24017);
    }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iiziizle6nl8bq.R.inc(24018);
    }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSerialization143() throws Exception {__CLR4_4_1iiziizle6nl8bq.R.globalSliceStart(getClass().getName(),24019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpr8zdij7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iiziizle6nl8bq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iiziizle6nl8bq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpr8zdij7() throws Exception{try{__CLR4_4_1iiziizle6nl8bq.R.inc(24019); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24020);Months test = Months.SEVEN; 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24021);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24022);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24023);oos.writeObject(test); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24024);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24025);oos.close(); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24026);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24027);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24028);Months result = (Months) ois.readObject(); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24029);ois.close(); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24030);assertSame(test, result); 
 }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}
public void testDividedBy_int144() {__CLR4_4_1iiziizle6nl8bq.R.globalSliceStart(getClass().getName(),24031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w17iegijj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iiziizle6nl8bq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iiziizle6nl8bq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w17iegijj(){try{__CLR4_4_1iiziizle6nl8bq.R.inc(24031); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24032);Months test = Months.months(12); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24033);assertEquals(6, test.dividedBy(2).getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24034);assertEquals(12, test.getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24035);assertEquals(4, test.dividedBy(3).getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24036);assertEquals(3, test.dividedBy(4).getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24037);assertEquals(2, test.dividedBy(5).getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24038);assertEquals(2, test.dividedBy(6).getMonths()); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24039);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24040);try { 
         __CLR4_4_1iiziizle6nl8bq.R.inc(24041);Months.ONE.dividedBy(0); 
         __CLR4_4_1iiziizle6nl8bq.R.inc(24042);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}
public void testIsLessThan145() {__CLR4_4_1iiziizle6nl8bq.R.globalSliceStart(getClass().getName(),24043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126hhk3ijv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iiziizle6nl8bq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iiziizle6nl8bq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126hhk3ijv(){try{__CLR4_4_1iiziizle6nl8bq.R.inc(24043); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24044);assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24045);assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24046);assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24047);assertEquals(false, Months.ONE.isLessThan(null)); 
     __CLR4_4_1iiziizle6nl8bq.R.inc(24048);assertEquals(true, Months.months(-1).isLessThan(null)); 
 }finally{__CLR4_4_1iiziizle6nl8bq.R.flushNeeded();}}
    

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
