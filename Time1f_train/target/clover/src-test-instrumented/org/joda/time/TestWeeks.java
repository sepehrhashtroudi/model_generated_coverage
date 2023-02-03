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
public class TestWeeks extends TestCase {static class __CLR4_4_1pyxpyxlc8axekf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33657);
        __CLR4_4_1pyxpyxlc8axekf.R.inc(33658);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33659);
        __CLR4_4_1pyxpyxlc8axekf.R.inc(33660);return new TestSuite(TestWeeks.class);
    }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}}

    public TestWeeks(String name) {
        super(name);__CLR4_4_1pyxpyxlc8axekf.R.inc(33662);try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33661);
    }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33663);
    }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33664);
    }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToStandardHours25() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzdjhrpz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardHours25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzdjhrpz5(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33665); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33666);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33667);Hours expected = Hours.hours(2 * 7 * 24); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33668);assertEquals(expected, test.toStandardHours()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33669);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33670);Weeks.MAX_VALUE.toStandardHours(); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33671);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testIsLessThan72() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19sjlqwpzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsLessThan72",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19sjlqwpzc(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33672); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33673);assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33674);assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33675);assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33676);assertEquals(false, Weeks.ONE.isLessThan(null)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33677);assertEquals(true, Weeks.weeks(-1).isLessThan(null)); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testFactory_parseWeeks_String99() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17eindwpzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_parseWeeks_String99",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17eindwpzi(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33678); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33679);assertEquals(0, Weeks.parseWeeks((String) null).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33680);assertEquals(0, Weeks.parseWeeks("P0W").getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33681);assertEquals(1, Weeks.parseWeeks("P1W").getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33682);assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33683);assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33684);assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33685);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33686);Weeks.parseWeeks("P1Y1D"); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33687);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33688);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33689);Weeks.parseWeeks("P1WT1H"); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33690);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testMinus_Weeks203() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq09oepzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_Weeks203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq09oepzv(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33691); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33692);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33693);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33694);Weeks result = test2.minus(test3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33695);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33696);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33697);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33698);assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33699);assertEquals(1, Weeks.ONE.minus((Weeks) null).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33700);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33701);Weeks.MIN_VALUE.minus(Weeks.ONE); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33702);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testFactory_weeksBetween_RInstant336() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d53s1q07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RInstant336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d53s1q07(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33703); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33704);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33705);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33706);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33707);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33708);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33709);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33710);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33711);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testDividedBy_int513() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19315oeq0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testDividedBy_int513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19315oeq0g(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33712); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33713);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33714);assertEquals(6, test.dividedBy(2).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33715);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33716);assertEquals(4, test.dividedBy(3).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33717);assertEquals(3, test.dividedBy(4).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33718);assertEquals(2, test.dividedBy(5).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33719);assertEquals(2, test.dividedBy(6).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33720);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33721);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33722);Weeks.ONE.dividedBy(0); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33723);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_weeksBetween_RPartial530() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw0id7q0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksBetween_RPartial530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw0id7q0s(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33724); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33725);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33726);LocalDate end1 = new LocalDate(2006, 6, 30); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33727);YearMonthDay end2 = new YearMonthDay(2006, 7, 21); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33728);assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33729);assertEquals(0, Weeks.weeksBetween(start, start).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33730);assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33731);assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33732);assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks()); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testFactory_standardWeeksIn_RPeriod758() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ws8dv7q11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_standardWeeksIn_RPeriod758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ws8dv7q11(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33733); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33734);assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33735);assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33736);assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33737);assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33738);assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33739);assertEquals(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33740);assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33741);assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33742);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33743);Weeks.standardWeeksIn(Period.months(1)); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33744);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testFactory_weeks_int803() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152o9baq1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeks_int803",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152o9baq1d(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33745); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33746);assertSame(Weeks.ZERO, Weeks.weeks(0)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33747);assertSame(Weeks.ONE, Weeks.weeks(1)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33748);assertSame(Weeks.TWO, Weeks.weeks(2)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33749);assertSame(Weeks.THREE, Weeks.weeks(3)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33750);assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33751);assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33752);assertEquals(-1, Weeks.weeks(-1).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33753);assertEquals(4, Weeks.weeks(4).getWeeks()); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testFactory_weeksIn_RInterval993() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199uiqjq1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testFactory_weeksIn_RInterval993",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199uiqjq1m(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33754); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33755);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33756);DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33757);DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33758);assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33759);assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33760);assertEquals(0, Weeks.weeksIn(new Interval(start, start)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33761);assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33762);assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks()); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testToStandardMinutes1005() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bu8e8q1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardMinutes1005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bu8e8q1v(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33763); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33764);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33765);Minutes expected = Minutes.minutes(2 * 7 * 24 * 60); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33766);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33767);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33768);Weeks.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33769);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testToStandardSeconds1037() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1buxx5rq22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardSeconds1037",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1buxx5rq22(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33770); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33771);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33772);Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33773);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33774);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33775);Weeks.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33776);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testMinus_int1158() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jc9w8q29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMinus_int1158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jc9w8q29(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33777); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33778);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33779);Weeks result = test2.minus(3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33780);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33781);assertEquals(-1, result.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33782);assertEquals(1, Weeks.ONE.minus(0).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33783);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33784);Weeks.MIN_VALUE.minus(1); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33785);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testIsGreaterThan1260() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wlw7q7q2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testIsGreaterThan1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wlw7q7q2i(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33786); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33787);assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33788);assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33789);assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33790);assertEquals(true, Weeks.ONE.isGreaterThan(null)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33791);assertEquals(false, Weeks.weeks(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testPlus_Weeks1399() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr7j3pq2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testPlus_Weeks1399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr7j3pq2o(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33792); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33793);Weeks test2 = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33794);Weeks test3 = Weeks.weeks(3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33795);Weeks result = test2.plus(test3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33796);assertEquals(2, test2.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33797);assertEquals(3, test3.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33798);assertEquals(5, result.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33799);assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33800);assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33801);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33802);Weeks.MAX_VALUE.plus(Weeks.ONE); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33803);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testToStandardDuration1424() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kyggaq30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testToStandardDuration1424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kyggaq30(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33804); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33805);Weeks test = Weeks.weeks(20); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33806);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33807);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33808);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33809);assertEquals(expected, Weeks.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testNegated1474() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb0vk9q36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testNegated1474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb0vk9q36(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33810); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33811);Weeks test = Weeks.weeks(12); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33812);assertEquals(-12, test.negated().getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33813);assertEquals(12, test.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33814);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33815);Weeks.MIN_VALUE.negated(); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33816);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testMultipliedBy_int1501() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udi160q3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testMultipliedBy_int1501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udi160q3d(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33817); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33818);Weeks test = Weeks.weeks(2); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33819);assertEquals(6, test.multipliedBy(3).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33820);assertEquals(2, test.getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33821);assertEquals(-6, test.multipliedBy(-3).getWeeks()); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33822);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33823);Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33824);try { 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33825);halfMax.multipliedBy(2); 
         __CLR4_4_1pyxpyxlc8axekf.R.inc(33826);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testSerialization1610() throws Exception {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmyv07q3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testSerialization1610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmyv07q3n() throws Exception{try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33827); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33828);Weeks test = Weeks.THREE; 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33829);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33830);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33831);oos.writeObject(test); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33832);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33833);oos.close(); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33834);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33835);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33836);Weeks result = (Weeks) ois.readObject(); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33837);ois.close(); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33838);assertSame(test, result); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 


public void testAddToLocalDate1750() {__CLR4_4_1pyxpyxlc8axekf.R.globalSliceStart(getClass().getName(),33839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yt112hq3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pyxpyxlc8axekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pyxpyxlc8axekf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestWeeks.testAddToLocalDate1750",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yt112hq3z(){try{__CLR4_4_1pyxpyxlc8axekf.R.inc(33839); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33840);Weeks test = Weeks.weeks(3); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33841);LocalDate date = new LocalDate(2006, 6, 1); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33842);LocalDate expected = new LocalDate(2006, 6, 22); 
     __CLR4_4_1pyxpyxlc8axekf.R.inc(33843);assertEquals(expected, date.plus(test)); 
 }finally{__CLR4_4_1pyxpyxlc8axekf.R.flushNeeded();}} 

    

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
