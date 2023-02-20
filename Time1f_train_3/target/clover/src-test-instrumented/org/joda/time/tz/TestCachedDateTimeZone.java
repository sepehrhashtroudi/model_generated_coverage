/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestCachedDateTimeZone extends TestCase {static class __CLR4_4_1uiyuiyle6rcn7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,39585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39562);
        __CLR4_4_1uiyuiyle6rcn7p.R.inc(39563);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39564);
        __CLR4_4_1uiyuiyle6rcn7p.R.inc(39565);return new TestSuite(TestCachedDateTimeZone.class);
    }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestCachedDateTimeZone(String name) {
        super(name);__CLR4_4_1uiyuiyle6rcn7p.R.inc(39567);try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39566);
    }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39568);
        __CLR4_4_1uiyuiyle6rcn7p.R.inc(39569);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1uiyuiyle6rcn7p.R.inc(39570);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39571);
        __CLR4_4_1uiyuiyle6rcn7p.R.inc(39572);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}}


public void testSerialization280() throws Exception {__CLR4_4_1uiyuiyle6rcn7p.R.globalSliceStart(getClass().getName(),39573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cvu19uj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uiyuiyle6rcn7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uiyuiyle6rcn7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCachedDateTimeZone.testSerialization280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cvu19uj9() throws Exception{try{__CLR4_4_1uiyuiyle6rcn7p.R.inc(39573); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39574);CachedDateTimeZone test = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris")); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39575);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39576);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39577);oos.writeObject(test); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39578);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39579);oos.close(); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39580);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39581);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39582);CachedDateTimeZone result = (CachedDateTimeZone) ois.readObject(); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39583);ois.close(); 
     __CLR4_4_1uiyuiyle6rcn7p.R.inc(39584);assertEquals(test, result); 
 }finally{__CLR4_4_1uiyuiyle6rcn7p.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

}
