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
public class TestMonths extends TestCase {static class __CLR4_4_1lsulsule6rjcnx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1lsulsule6rjcnx.R.inc(28254);
        __CLR4_4_1lsulsule6rjcnx.R.inc(28255);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lsulsule6rjcnx.R.inc(28256);
        __CLR4_4_1lsulsule6rjcnx.R.inc(28257);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1lsulsule6rjcnx.R.inc(28259);try{__CLR4_4_1lsulsule6rjcnx.R.inc(28258);
    }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lsulsule6rjcnx.R.inc(28260);
    }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lsulsule6rjcnx.R.inc(28261);
    }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_parseMonths_String179() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qubesplt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qubesplt2(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28262); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28263);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28264);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28265);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28266);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28267);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28268);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28269);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28270);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28271);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28272);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28273);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testGetPeriodType316() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13doatcltf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13doatcltf(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28275); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28276);Months test = Months.months(20); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28277);assertEquals(PeriodType.months(), test.getPeriodType()); 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testMinus_Months317() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srf58slti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srf58slti(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28278); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28279);Months test2 = Months.months(2); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28280);Months test3 = Months.months(3); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28281);Months result = test2.minus(test3); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28282);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28283);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28284);assertEquals(-1, result.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28285);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28286);assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28287);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28288);Months.MIN_VALUE.minus(Months.ONE); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28289);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testFactory_months_int318() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6h6yfltu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_months_int318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6h6yfltu(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28290); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28291);assertSame(Months.ZERO, Months.months(0)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28292);assertSame(Months.ONE, Months.months(1)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28293);assertSame(Months.TWO, Months.months(2)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28294);assertSame(Months.THREE, Months.months(3)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28295);assertSame(Months.FOUR, Months.months(4)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28296);assertSame(Months.FIVE, Months.months(5)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28297);assertSame(Months.SIX, Months.months(6)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28298);assertSame(Months.SEVEN, Months.months(7)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28299);assertSame(Months.EIGHT, Months.months(8)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28300);assertSame(Months.NINE, Months.months(9)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28301);assertSame(Months.TEN, Months.months(10)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28302);assertSame(Months.ELEVEN, Months.months(11)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28303);assertSame(Months.TWELVE, Months.months(12)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28304);assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28305);assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28306);assertEquals(-1, Months.months(-1).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28307);assertEquals(13, Months.months(13).getMonths()); 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testPlus_Months319() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fllrz8luc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fllrz8luc(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28308); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28309);Months test2 = Months.months(2); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28310);Months test3 = Months.months(3); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28311);Months result = test2.plus(test3); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28312);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28313);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28314);assertEquals(5, result.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28315);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28316);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28317);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28318);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28319);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testFactory_monthsBetween_RPartial_YearMonth320() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9zz04luo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9zz04luo(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28320); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28321);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28322);for (int i = 0; (((i < 6)&&(__CLR4_4_1lsulsule6rjcnx.R.iget(28323)!=0|true))||(__CLR4_4_1lsulsule6rjcnx.R.iget(28324)==0&false)); i++) {{ 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28325);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28326);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28327);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28328);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testSerialization321() throws Exception {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujg6kblux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujg6kblux() throws Exception{try{__CLR4_4_1lsulsule6rjcnx.R.inc(28329); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28330);Months test = Months.THREE; 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28331);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28332);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28333);oos.writeObject(test); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28334);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28335);oos.close(); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28336);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28337);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28338);Months result = (Months) ois.readObject(); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28339);ois.close(); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28340);assertSame(test, result); 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testMultipliedBy_int322() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbb7w2lv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbb7w2lv9(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28341); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28342);Months test = Months.months(2); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28343);assertEquals(6, test.multipliedBy(3).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28344);assertEquals(2, test.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28345);assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28346);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28347);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28348);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28349);halfMax.multipliedBy(2); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28350);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testDividedBy_int323() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryim11lvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryim11lvj(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28351); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28352);Months test = Months.months(12); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28353);assertEquals(6, test.dividedBy(2).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28354);assertEquals(12, test.getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28355);assertEquals(4, test.dividedBy(3).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28356);assertEquals(3, test.dividedBy(4).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28357);assertEquals(2, test.dividedBy(5).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28358);assertEquals(2, test.dividedBy(6).getMonths()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28359);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28360);try { 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28361);Months.ONE.dividedBy(0); 
         __CLR4_4_1lsulsule6rjcnx.R.inc(28362);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testIsLessThan324() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1696dxilvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1696dxilvv(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28363); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28364);assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28365);assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28366);assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28367);assertEquals(false, Months.ONE.isLessThan(null)); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28368);assertEquals(true, Months.months(-1).isLessThan(null)); 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 


public void testToString325() {__CLR4_4_1lsulsule6rjcnx.R.globalSliceStart(getClass().getName(),28369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r343c1lw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsulsule6rjcnx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsulsule6rjcnx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r343c1lw1(){try{__CLR4_4_1lsulsule6rjcnx.R.inc(28369); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28370);Months test = Months.months(20); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28371);assertEquals("P20M", test.toString()); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28372);test = Months.months(-20); 
     __CLR4_4_1lsulsule6rjcnx.R.inc(28373);assertEquals("P-20M", test.toString()); 
 }finally{__CLR4_4_1lsulsule6rjcnx.R.flushNeeded();}} 

    

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
