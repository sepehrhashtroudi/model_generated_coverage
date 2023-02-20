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
 * This class is a Junit unit test for Years.
 *
 * @author Stephen Colebourne
 */
public class TestYears extends TestCase {static class __CLR4_4_1pg2pg2le6qeab9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32978);
        __CLR4_4_1pg2pg2le6qeab9.R.inc(32979);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32980);
        __CLR4_4_1pg2pg2le6qeab9.R.inc(32981);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1pg2pg2le6qeab9.R.inc(32983);try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32982);
    }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32984);
    }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32985);
    }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString672() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),32986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybiefupga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString672",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybiefupga(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32986); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32987);Years test = Years.years(20); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32988);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32989);test = Years.years(-20); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32990);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testFactory_yearsBetween_RInstant673() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),32991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om4fwcpgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant673",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om4fwcpgf(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(32991); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32992);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32993);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32994);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32995);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32996);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32997);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32998);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(32999);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testFactory_years_int674() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2rkpxpgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2rkpxpgo(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33000); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33001);assertSame(Years.ZERO, Years.years(0)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33002);assertSame(Years.ONE, Years.years(1)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33003);assertSame(Years.TWO, Years.years(2)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33004);assertSame(Years.THREE, Years.years(3)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33005);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33006);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33007);assertEquals(-1, Years.years(-1).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33008);assertEquals(4, Years.years(4).getYears()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_yearsBetween_RPartial675() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4droapgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4droapgx(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33009); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33010);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33011);LocalDate end1 = new LocalDate(2009, 6, 9); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33012);YearMonthDay end2 = new YearMonthDay(2012, 6, 9); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33013);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33014);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33015);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33016);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33017);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testFactory_yearsIn_RInterval676() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fgin00ph6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fgin00ph6(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33018); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33019);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33020);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33021);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33022);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33023);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33024);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33025);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33026);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testSerialization678() throws Exception {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hm5rpcphf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hm5rpcphf() throws Exception{try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33027); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33028);Years test = Years.THREE; 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33029);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33030);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33031);oos.writeObject(test); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33032);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33033);oos.close(); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33034);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33035);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33036);Years result = (Years) ois.readObject(); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33037);ois.close(); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33038);assertSame(test, result); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testGetFieldType679() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8sbrjphr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8sbrjphr(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33039); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33040);Years test = Years.years(20); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33041);assertEquals(DurationFieldType.years(), test.getFieldType()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testGetPeriodType680() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yck0a2phu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yck0a2phu(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33042); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33043);Years test = Years.years(20); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33044);assertEquals(PeriodType.years(), test.getPeriodType()); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testPlus_Years681() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14f2vtfphx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years681",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14f2vtfphx(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33045); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33046);Years test2 = Years.years(2); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33047);Years test3 = Years.years(3); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33048);Years result = test2.plus(test3); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33049);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33050);assertEquals(3, test3.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33051);assertEquals(5, result.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33052);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33053);assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33054);try { 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33055);Years.MAX_VALUE.plus(Years.ONE); 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33056);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testMinus_int682() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i227g7pi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_int682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i227g7pi9(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33057); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33058);Years test2 = Years.years(2); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33059);Years result = test2.minus(3); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33060);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33061);assertEquals(-1, result.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33062);assertEquals(1, Years.ONE.minus(0).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33063);try { 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33064);Years.MIN_VALUE.minus(1); 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33065);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testMinus_Years683() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9nm77pii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9nm77pii(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33066); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33067);Years test2 = Years.years(2); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33068);Years test3 = Years.years(3); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33069);Years result = test2.minus(test3); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33070);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33071);assertEquals(3, test3.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33072);assertEquals(-1, result.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33073);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33074);assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33075);try { 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33076);Years.MIN_VALUE.minus(Years.ONE); 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33077);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testDividedBy_int684() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154ulh5piu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testDividedBy_int684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154ulh5piu(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33078); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33079);Years test = Years.years(12); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33080);assertEquals(6, test.dividedBy(2).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33081);assertEquals(12, test.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33082);assertEquals(4, test.dividedBy(3).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33083);assertEquals(3, test.dividedBy(4).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33084);assertEquals(2, test.dividedBy(5).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33085);assertEquals(2, test.dividedBy(6).getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33086);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33087);try { 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33088);Years.ONE.dividedBy(0); 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33089);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testNegated685() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uinmepj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uinmepj6(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33090); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33091);Years test = Years.years(12); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33092);assertEquals(-12, test.negated().getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33093);assertEquals(12, test.getYears()); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33094);try { 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33095);Years.MIN_VALUE.negated(); 
         __CLR4_4_1pg2pg2le6qeab9.R.inc(33096);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testIsGreaterThan686() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flmw90pjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan686",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flmw90pjd(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33097); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33098);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33099);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33100);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33101);assertEquals(true, Years.ONE.isGreaterThan(null)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33102);assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 


public void testIsLessThan687() {__CLR4_4_1pg2pg2le6qeab9.R.globalSliceStart(getClass().getName(),33103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6kiyipjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pg2pg2le6qeab9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pg2pg2le6qeab9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6kiyipjj(){try{__CLR4_4_1pg2pg2le6qeab9.R.inc(33103); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33104);assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33105);assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33106);assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33107);assertEquals(false, Years.ONE.isLessThan(null)); 
     __CLR4_4_1pg2pg2le6qeab9.R.inc(33108);assertEquals(true, Years.years(-1).isLessThan(null)); 
 }finally{__CLR4_4_1pg2pg2le6qeab9.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
