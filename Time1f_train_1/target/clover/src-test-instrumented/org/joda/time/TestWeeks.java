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
public class TestWeeks extends TestCase {static class __CLR4_4_1or2or2le6qea8a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1or2or2le6qea8a.R.inc(32078);
        __CLR4_4_1or2or2le6qea8a.R.inc(32079);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1or2or2le6qea8a.R.inc(32080);
        __CLR4_4_1or2or2le6qea8a.R.inc(32081);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1or2or2le6qea8a.R.inc(32083);try{__CLR4_4_1or2or2le6qea8a.R.inc(32082);
    }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1or2or2le6qea8a.R.inc(32084);
    }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1or2or2le6qea8a.R.inc(32085);
    }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_weeksBetween_RInstant532() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmuco3ora();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmuco3ora(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32086); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32087);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32088);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32089);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32090);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32091);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32092);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32093);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32094);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testFactory_parseWeeks_String533() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqnmlborj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqnmlborj(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32095); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32096);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32097);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32098);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32099);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32100);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32101);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32102);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32103);Weeks.parseWeeks("P1Y1D"); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32104);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1or2or2le6qea8a.R.inc(32105);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32106);Weeks.parseWeeks("P1WT1H"); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testFactory_weeks_int535() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyceieorw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyceieorw(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32108); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32109);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32110);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32111);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32112);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32113);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32114);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32115);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32116);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial536() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rn3qv3os5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rn3qv3os5(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32117); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32118);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32119);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32120);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32121);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32122);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32123);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32124);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32125);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testFactory_weeksIn_RInterval537() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzd7f9ose();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzd7f9ose(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32126); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32127);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32128);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32129);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32130);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32131);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32132);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32133);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32134);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testFactory_standardWeeksIn_RPeriod538() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx4r8zosn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx4r8zosn(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32135); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32136);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32137);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32138);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32139);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32140);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32141);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32142);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32143);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32144);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32145);Weeks.standardWeeksIn(Period.months(1)); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32146);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testSerialization539() throws Exception {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayhdqcosz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayhdqcosz() throws Exception{try{__CLR4_4_1or2or2le6qea8a.R.inc(32147); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32148);Weeks test = Weeks.THREE; 
     __CLR4_4_1or2or2le6qea8a.R.inc(32149);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32150);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32151);oos.writeObject(test); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32152);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32153);oos.close(); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32154);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32155);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32156);Weeks result = (Weeks) ois.readObject(); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32157);ois.close(); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32158);assertSame(test, result); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testAddToLocalDate540() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ynnefotb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ynnefotb(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32159); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32160);Weeks test = Weeks.weeks(3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32161);LocalDate date = new LocalDate(2006, 6, 1); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32162);LocalDate expected = new LocalDate(2006, 6, 22); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32163);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testToStandardDays541() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wb4egotg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDays541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wb4egotg(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32164); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32165);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32166);Days expected = Days.days(14); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32167);assertEquals(expected, test.toStandardDays()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32168);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32169);Weeks.MAX_VALUE.toStandardDays(); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32170);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testToStandardHours542() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrce2dotn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrce2dotn(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32171); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32172);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32173);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32174);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32175);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32176);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32177);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testToStandardMinutes543() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff3g7aotu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff3g7aotu(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32178); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32179);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32180);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32181);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32182);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32183);Weeks.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32184);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testMinus_int544() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drkwryou1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drkwryou1(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32185); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32186);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32187);Weeks result = test2.minus(3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32188);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32189);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32190);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32191);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32192);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32193);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testPlus_Weeks545() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2u35oua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2u35oua(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32194); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32195);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32196);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32197);Weeks result = test2.plus(test3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32198);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32199);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32200);assertEquals(5, result.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32201);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32202);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32203);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32204);Weeks.MAX_VALUE.plus(Weeks.ONE); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32205);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testMinus_Weeks546() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vnlogoum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vnlogoum(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32206); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32207);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32208);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32209);Weeks result = test2.minus(test3); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32210);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32211);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32212);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32213);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32214);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32215);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32216);Weeks.MIN_VALUE.minus(Weeks.ONE); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32217);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testDividedBy_int547() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utmdhdouy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utmdhdouy(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32218); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32219);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32220);assertEquals(6, test.dividedBy(2).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32221);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32222);assertEquals(4, test.dividedBy(3).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32223);assertEquals(3, test.dividedBy(4).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32224);assertEquals(2, test.dividedBy(5).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32225);assertEquals(2, test.dividedBy(6).getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32226);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32227);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32228);Weeks.ONE.dividedBy(0); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32229);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testNegated548() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x84fe8ova();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x84fe8ova(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32230); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32231);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32232);assertEquals(-12, test.negated().getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32233);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32234);try { 
         __CLR4_4_1or2or2le6qea8a.R.inc(32235);Weeks.MIN_VALUE.negated(); 
         __CLR4_4_1or2or2le6qea8a.R.inc(32236);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testIsGreaterThan549() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh06rmovh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh06rmovh(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32237); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32238);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32239);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32240);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32241);assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32242);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 


public void testIsLessThan550() {__CLR4_4_1or2or2le6qea8a.R.globalSliceStart(getClass().getName(),32243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173xsoxovn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or2or2le6qea8a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or2or2le6qea8a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173xsoxovn(){try{__CLR4_4_1or2or2le6qea8a.R.inc(32243); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32244);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32245);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32246);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32247);assertEquals(false, Weeks.ONE.isLessThan(null)); 
     __CLR4_4_1or2or2le6qea8a.R.inc(32248);assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
 }finally{__CLR4_4_1or2or2le6qea8a.R.flushNeeded();}} 

    

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
