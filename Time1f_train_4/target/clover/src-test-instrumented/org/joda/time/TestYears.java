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
public class TestYears extends TestCase {static class __CLR4_4_1pfrpfrle6rjd9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,33100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32967);
        __CLR4_4_1pfrpfrle6rjd9c.R.inc(32968);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32969);
        __CLR4_4_1pfrpfrle6rjd9c.R.inc(32970);return new TestSuite(TestYears.class);
    }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}}

    public TestYears(String name) {
        super(name);__CLR4_4_1pfrpfrle6rjd9c.R.inc(32972);try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32971);
    }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32973);
    }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32974);
    }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString687() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),32975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19992ympfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testToString687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19992ympfz(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32975); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32976);Years test = Years.years(20); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32977);assertEquals("P20Y", test.toString()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32978);test = Years.years(-20); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32979);assertEquals("P-20Y", test.toString()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testFactory_yearsBetween_RInstant688() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),32980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lcqalkpg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RInstant688",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lcqalkpg4(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32980); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32981);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32982);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32983);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32984);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32985);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32986);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32987);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32988);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testFactory_parseYears_String689() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),32989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1reoscopgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_parseYears_String689",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1reoscopgd(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(32989); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32990);assertEquals(0, Years.parseYears((String) null).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32991);assertEquals(0, Years.parseYears("P0Y").getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32992);assertEquals(1, Years.parseYears("P1Y").getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32993);assertEquals(-3, Years.parseYears("P-3Y").getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32994);assertEquals(2, Years.parseYears("P2Y0M").getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32995);assertEquals(2, Years.parseYears("P2YT0H0M").getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32996);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(32997);Years.parseYears("P1M1D"); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(32998);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(32999);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33000);Years.parseYears("P1YT1H"); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33001);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testMultipliedBy_int690() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqwzs8pgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMultipliedBy_int690",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqwzs8pgq(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33002); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33003);Years test = Years.years(2); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33004);assertEquals(6, test.multipliedBy(3).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33005);assertEquals(2, test.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33006);assertEquals(-6, test.multipliedBy(-3).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33007);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33008);Years halfMax = Years.years(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33009);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33010);halfMax.multipliedBy(2); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33011);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testFactory_years_int691() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1slybzqph0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_years_int691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1slybzqph0(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33012); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33013);assertSame(Years.ZERO, Years.years(0)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33014);assertSame(Years.ONE, Years.years(1)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33015);assertSame(Years.TWO, Years.years(2)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33016);assertSame(Years.THREE, Years.years(3)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33017);assertSame(Years.MAX_VALUE, Years.years(Integer.MAX_VALUE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33018);assertSame(Years.MIN_VALUE, Years.years(Integer.MIN_VALUE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33019);assertEquals(-1, Years.years(-1).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33020);assertEquals(4, Years.years(4).getYears()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_yearsBetween_RPartial692() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkc51dph9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsBetween_RPartial692",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkc51dph9(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33021); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33022);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33023);LocalDate end1 = new LocalDate(2009, 6, 9); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33024);YearMonthDay end2 = new YearMonthDay(2012, 6, 9); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33025);assertEquals(3, Years.yearsBetween(start, end1).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33026);assertEquals(0, Years.yearsBetween(start, start).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33027);assertEquals(0, Years.yearsBetween(end1, end1).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33028);assertEquals(-3, Years.yearsBetween(end1, start).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33029);assertEquals(6, Years.yearsBetween(start, end2).getYears()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testFactory_yearsIn_RInterval693() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y879pnphi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testFactory_yearsIn_RInterval693",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y879pnphi(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33030); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33031);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33032);DateTime end1 = new DateTime(2009, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33033);DateTime end2 = new DateTime(2012, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33034);assertEquals(0, Years.yearsIn((ReadableInterval) null).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33035);assertEquals(3, Years.yearsIn(new Interval(start, end1)).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33036);assertEquals(0, Years.yearsIn(new Interval(start, start)).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33037);assertEquals(0, Years.yearsIn(new Interval(end1, end1)).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33038);assertEquals(6, Years.yearsIn(new Interval(start, end2)).getYears()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testSerialization695() throws Exception {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2k50bphr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testSerialization695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2k50bphr() throws Exception{try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33039); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33040);Years test = Years.THREE; 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33041);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33042);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33043);oos.writeObject(test); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33044);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33045);oos.close(); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33046);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33047);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33048);Years result = (Years) ois.readObject(); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33049);ois.close(); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33050);assertSame(test, result); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testGetFieldType696() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193lthypi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetFieldType696",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193lthypi3(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33051); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33052);Years test = Years.years(20); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33053);assertEquals(DurationFieldType.years(), test.getFieldType()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testGetPeriodType697() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4ansspi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testGetPeriodType697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4ansspi6(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33054); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33055);Years test = Years.years(20); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33056);assertEquals(PeriodType.years(), test.getPeriodType()); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testPlus_Years698() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e56i2vpi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testPlus_Years698",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e56i2vpi9(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33057); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33058);Years test2 = Years.years(2); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33059);Years test3 = Years.years(3); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33060);Years result = test2.plus(test3); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33061);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33062);assertEquals(3, test3.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33063);assertEquals(5, result.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33064);assertEquals(1, Years.ONE.plus(Years.ZERO).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33065);assertEquals(1, Years.ONE.plus((Years) null).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33066);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33067);Years.MAX_VALUE.plus(Years.ONE); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33068);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testMinus_Years699() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjlqhkpil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testMinus_Years699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjlqhkpil(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33069); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33070);Years test2 = Years.years(2); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33071);Years test3 = Years.years(3); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33072);Years result = test2.minus(test3); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33073);assertEquals(2, test2.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33074);assertEquals(3, test3.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33075);assertEquals(-1, result.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33076);assertEquals(1, Years.ONE.minus(Years.ZERO).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33077);assertEquals(1, Years.ONE.minus((Years) null).getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33078);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33079);Years.MIN_VALUE.minus(Years.ONE); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33080);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testNegated700() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q57t4epix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testNegated700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q57t4epix(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33081); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33082);Years test = Years.years(12); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33083);assertEquals(-12, test.negated().getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33084);assertEquals(12, test.getYears()); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33085);try { 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33086);Years.MIN_VALUE.negated(); 
         __CLR4_4_1pfrpfrle6rjd9c.R.inc(33087);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testIsGreaterThan701() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ce3khspj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsGreaterThan701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ce3khspj4(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33088); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33089);assertEquals(true, Years.THREE.isGreaterThan(Years.TWO)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33090);assertEquals(false, Years.THREE.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33091);assertEquals(false, Years.TWO.isGreaterThan(Years.THREE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33092);assertEquals(true, Years.ONE.isGreaterThan(null)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33093);assertEquals(false, Years.years(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 


public void testIsLessThan702() {__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceStart(getClass().getName(),33094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t5xsapja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfrpfrle6rjd9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfrpfrle6rjd9c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYears.testIsLessThan702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t5xsapja(){try{__CLR4_4_1pfrpfrle6rjd9c.R.inc(33094); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33095);assertEquals(false, Years.THREE.isLessThan(Years.TWO)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33096);assertEquals(false, Years.THREE.isLessThan(Years.THREE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33097);assertEquals(true, Years.TWO.isLessThan(Years.THREE)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33098);assertEquals(false, Years.ONE.isLessThan(null)); 
     __CLR4_4_1pfrpfrle6rjd9c.R.inc(33099);assertEquals(true, Years.years(-1).isLessThan(null)); 
 }finally{__CLR4_4_1pfrpfrle6rjd9c.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
