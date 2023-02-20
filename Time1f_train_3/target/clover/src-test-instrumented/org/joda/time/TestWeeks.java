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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks extends TestCase {static class __CLR4_4_1ommommle6rcm6s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ommommle6rcm6s.R.inc(31918);
        __CLR4_4_1ommommle6rcm6s.R.inc(31919);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ommommle6rcm6s.R.inc(31920);
        __CLR4_4_1ommommle6rcm6s.R.inc(31921);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1ommommle6rcm6s.R.inc(31923);try{__CLR4_4_1ommommle6rcm6s.R.inc(31922);
    }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ommommle6rcm6s.R.inc(31924);
    }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ommommle6rcm6s.R.inc(31925);
    }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToStandardSeconds526() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yth2glomu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yth2glomu(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31926); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31927);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31928);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31929);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31930);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(31931);Weeks.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1ommommle6rcm6s.R.inc(31932);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testFactory_weeksBetween_RInstant547() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kc0dtton1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kc0dtton1(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31933); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31934);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31935);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31936);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31937);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31938);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31939);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31940);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31941);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testFactory_parseWeeks_String548() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oeb43ona();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oeb43ona(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31942); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31943);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31944);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31945);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31946);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31947);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31948);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31949);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(31950);Weeks.parseWeeks("P1Y1D"); 
         __CLR4_4_1ommommle6rcm6s.R.inc(31951);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ommommle6rcm6s.R.inc(31952);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(31953);Weeks.parseWeeks("P1WT1H"); 
         __CLR4_4_1ommommle6rcm6s.R.inc(31954);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testFactory_weeks_int549() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12cwvrbonn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12cwvrbonn(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31955); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31956);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31957);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31958);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31959);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31960);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31961);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31962);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31963);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial550() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cam9h5onw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cam9h5onw(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31964); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31965);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31966);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31967);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31968);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31969);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31970);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31971);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31972);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testFactory_weeksIn_RInterval551() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fycswzoo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fycswzoo5(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31973); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31974);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31975);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31976);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31977);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31978);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31979);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31980);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31981);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testSerialization552() throws Exception {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndwmp1ooe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndwmp1ooe() throws Exception{try{__CLR4_4_1ommommle6rcm6s.R.inc(31982); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31983);Weeks test = Weeks.THREE; 
     __CLR4_4_1ommommle6rcm6s.R.inc(31984);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31985);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31986);oos.writeObject(test); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31987);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31988);oos.close(); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31989);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31990);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31991);Weeks result = (Weeks) ois.readObject(); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31992);ois.close(); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31993);assertSame(test, result); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testAddToLocalDate553() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi75ijooq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi75ijooq(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31994); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31995);Weeks test = Weeks.weeks(3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31996);LocalDate date = new LocalDate(2006, 6, 1); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31997);LocalDate expected = new LocalDate(2006, 6, 22); 
     __CLR4_4_1ommommle6rcm6s.R.inc(31998);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testToStandardHours555() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),31999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19swuztoov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19swuztoov(){try{__CLR4_4_1ommommle6rcm6s.R.inc(31999); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32000);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32001);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32002);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32003);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32004);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32005);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testToStandardMinutes556() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g55suwop2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes556",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g55suwop2(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32006); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32007);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32008);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32009);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32010);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32011);Weeks.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32012);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testToStandardDuration557() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hoa80op9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hoa80op9(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32013); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32014);Weeks test = Weeks.weeks(20); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32015);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32016);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32017);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32018);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testMinus_int558() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejodhropf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejodhropf(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32019); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32020);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32021);Weeks result = test2.minus(3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32022);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32023);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32024);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32025);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32026);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32027);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testPlus_Weeks559() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s16g6kopo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks559",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s16g6kopo(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32028); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32029);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32030);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32031);Weeks result = test2.plus(test3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32032);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32033);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32034);assertEquals(5, result.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32035);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32036);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32037);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32038);Weeks.MAX_VALUE.plus(Weeks.ONE); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32039);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testMinus_Weeks560() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7qfygoq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks560",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7qfygoq0(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32040); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32041);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32042);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32043);Weeks result = test2.minus(test3); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32044);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32045);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32046);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32047);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32048);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32049);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32050);Weeks.MIN_VALUE.minus(Weeks.ONE); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32051);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testMultipliedBy_int561() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0azsboqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0azsboqc(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32052); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32053);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32054);assertEquals(6, test.multipliedBy(3).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32055);assertEquals(2, test.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32056);assertEquals(-6, test.multipliedBy(-3).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32057);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32058);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32059);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32060);halfMax.multipliedBy(2); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32061);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testDividedBy_int562() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cd3lncoqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int562",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cd3lncoqm(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32062); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32063);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32064);assertEquals(6, test.dividedBy(2).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32065);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32066);assertEquals(4, test.dividedBy(3).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32067);assertEquals(3, test.dividedBy(4).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32068);assertEquals(2, test.dividedBy(5).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32069);assertEquals(2, test.dividedBy(6).getWeeks()); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32070);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32071);try { 
         __CLR4_4_1ommommle6rcm6s.R.inc(32072);Weeks.ONE.dividedBy(0); 
         __CLR4_4_1ommommle6rcm6s.R.inc(32073);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 


public void testIsLessThan563() {__CLR4_4_1ommommle6rcm6s.R.globalSliceStart(getClass().getName(),32074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogbgd9oqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ommommle6rcm6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ommommle6rcm6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan563",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogbgd9oqy(){try{__CLR4_4_1ommommle6rcm6s.R.inc(32074); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32075);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32076);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32077);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32078);assertEquals(false, Weeks.ONE.isLessThan(null)); 
     __CLR4_4_1ommommle6rcm6s.R.inc(32079);assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
 }finally{__CLR4_4_1ommommle6rcm6s.R.flushNeeded();}} 

    

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
