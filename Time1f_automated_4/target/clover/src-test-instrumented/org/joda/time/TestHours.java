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
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours extends TestCase {static class __CLR4_4_1hqehqele6o79q1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hqehqele6o79q1.R.inc(22982);
        __CLR4_4_1hqehqele6o79q1.R.inc(22983);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hqehqele6o79q1.R.inc(22984);
        __CLR4_4_1hqehqele6o79q1.R.inc(22985);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1hqehqele6o79q1.R.inc(22987);try{__CLR4_4_1hqehqele6o79q1.R.inc(22986);
    }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hqehqele6o79q1.R.inc(22988);
    }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hqehqele6o79q1.R.inc(22989);
    }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToStandardSeconds422() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),22990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcht7qhqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcht7qhqm(){try{__CLR4_4_1hqehqele6o79q1.R.inc(22990); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22991);Hours test = Hours.hours(3); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22992);Seconds expected = Seconds.seconds(3 * 60 * 60); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22993);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22994);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(22995);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1hqehqele6o79q1.R.inc(22996);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testPlus_int423() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),22997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pve6jkhqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pve6jkhqt(){try{__CLR4_4_1hqehqele6o79q1.R.inc(22997); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22998);Hours test2 = Hours.hours(2); 
     __CLR4_4_1hqehqele6o79q1.R.inc(22999);Hours result = test2.plus(3); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23000);assertEquals(2, test2.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23001);assertEquals(5, result.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23002);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23003);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(23004);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1hqehqele6o79q1.R.inc(23005);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testFactory_hoursBetween_RPartial424() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zcsq9hr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zcsq9hr2(){try{__CLR4_4_1hqehqele6o79q1.R.inc(23006); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23007);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23008);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23009);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23010);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23011);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23012);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23013);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23014);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testSerialization425() throws Exception {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmip40hrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmip40hrb() throws Exception{try{__CLR4_4_1hqehqele6o79q1.R.inc(23015); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23016);Hours test = Hours.SEVEN; 
     __CLR4_4_1hqehqele6o79q1.R.inc(23017);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23018);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23019);oos.writeObject(test); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23020);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23021);oos.close(); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23022);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23023);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23024);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23025);ois.close(); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23026);assertSame(test, result); 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testFactory_parseHours_String428() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmg0j8hrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmg0j8hrn(){try{__CLR4_4_1hqehqele6o79q1.R.inc(23027); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23028);assertEquals(0, Hours.parseHours((String) null).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23029);assertEquals(0, Hours.parseHours("PT0H").getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23030);assertEquals(1, Hours.parseHours("PT1H").getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23031);assertEquals(-3, Hours.parseHours("PT-3H").getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23032);assertEquals(2, Hours.parseHours("P0Y0M0DT2H0M").getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23033);assertEquals(2, Hours.parseHours("PT0H2H0M").getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23034);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(23035);Hours.parseHours("P1Y1D"); 
         __CLR4_4_1hqehqele6o79q1.R.inc(23036);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hqehqele6o79q1.R.inc(23037);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(23038);Hours.parseHours("P1DT1H"); 
         __CLR4_4_1hqehqele6o79q1.R.inc(23039);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testPlus_Hours429() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zaddcqhs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zaddcqhs0(){try{__CLR4_4_1hqehqele6o79q1.R.inc(23040); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23041);Hours test2 = Hours.hours(2); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23042);Hours test3 = Hours.hours(3); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23043);Hours result = test2.plus(test3); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23044);assertEquals(2, test2.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23045);assertEquals(3, test3.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23046);assertEquals(5, result.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23047);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23048);assertEquals(1, Hours.ONE.plus((Hours) null).getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23049);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(23050);Hours.MAX_VALUE.plus(Hours.ONE); 
         __CLR4_4_1hqehqele6o79q1.R.inc(23051);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testNegated430() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcvim0hsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcvim0hsc(){try{__CLR4_4_1hqehqele6o79q1.R.inc(23052); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23053);Hours test = Hours.hours(12); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23054);assertEquals(-12, test.negated().getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23055);assertEquals(12, test.getHours()); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23056);try { 
         __CLR4_4_1hqehqele6o79q1.R.inc(23057);Hours.MIN_VALUE.negated(); 
         __CLR4_4_1hqehqele6o79q1.R.inc(23058);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
public void testIsLessThan431() {__CLR4_4_1hqehqele6o79q1.R.globalSliceStart(getClass().getName(),23059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o36p8jhsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqehqele6o79q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqehqele6o79q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o36p8jhsj(){try{__CLR4_4_1hqehqele6o79q1.R.inc(23059); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23060);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO)); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23061);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE)); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23062);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE)); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23063);assertEquals(false, Hours.ONE.isLessThan(null)); 
     __CLR4_4_1hqehqele6o79q1.R.inc(23064);assertEquals(true, Hours.hours(-1).isLessThan(null)); 
 }finally{__CLR4_4_1hqehqele6o79q1.R.flushNeeded();}}
    

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
