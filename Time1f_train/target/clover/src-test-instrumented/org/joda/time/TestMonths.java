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
public class TestMonths extends TestCase {static class __CLR4_4_1mkxmkxlc8axe3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29265);
        __CLR4_4_1mkxmkxlc8axe3u.R.inc(29266);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29267);
        __CLR4_4_1mkxmkxlc8axe3u.R.inc(29268);return new TestSuite(TestMonths.class);
    }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}}

    public TestMonths(String name) {
        super(name);__CLR4_4_1mkxmkxlc8axe3u.R.inc(29270);try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29269);
    }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29271);
    }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29272);
    }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDividedBy_int132() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s1pg7ml5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testDividedBy_int132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s1pg7ml5(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29273); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29274);Months test = Months.months(12); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29275);assertEquals(6, test.dividedBy(2).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29276);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29277);assertEquals(4, test.dividedBy(3).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29278);assertEquals(3, test.dividedBy(4).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29279);assertEquals(2, test.dividedBy(5).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29280);assertEquals(2, test.dividedBy(6).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29281);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29282);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29283);Months.ONE.dividedBy(0); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29284);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testFactory_parseMonths_String133() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uj43tzmlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_parseMonths_String133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uj43tzmlh(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29285); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29286);assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29287);assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29288);assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29289);assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29290);assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29291);assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29292);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29293);Months.parseMonths("P1Y1D"); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29294);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29295);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29296);Months.parseMonths("P1MT1H"); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testMinus_Months258() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayhb48mlu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMinus_Months258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayhb48mlu(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29298); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29299);Months test2 = Months.months(2); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29300);Months test3 = Months.months(3); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29301);Months result = test2.minus(test3); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29302);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29303);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29304);assertEquals(-1, result.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29305);assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29306);assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29307);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29308);Months.MIN_VALUE.minus(Months.ONE); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29309);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testSerialization281() throws Exception {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123vv8smm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testSerialization281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123vv8smm6() throws Exception{try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29310); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29311);Months test = Months.THREE; 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29312);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29313);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29314);oos.writeObject(test); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29315);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29316);oos.close(); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29317);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29318);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29319);Months result = (Months) ois.readObject(); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29320);ois.close(); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29321);assertSame(test, result); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testFactory_monthsBetween_RInstant461() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqyy7qmmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RInstant461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqyy7qmmi(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29322); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29323);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29324);DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29325);DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29326);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29327);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29328);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29329);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29330);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testPlus_Months494() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bx8dsmmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testPlus_Months494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bx8dsmmr(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29331); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29332);Months test2 = Months.months(2); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29333);Months test3 = Months.months(3); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29334);Months result = test2.plus(test3); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29335);assertEquals(2, test2.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29336);assertEquals(3, test3.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29337);assertEquals(5, result.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29338);assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29339);assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29340);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29341);Months.MAX_VALUE.plus(Months.ONE); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29342);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testFactory_monthsBetween_RPartial_YearMonth649() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sj1cn2mn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_YearMonth649",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sj1cn2mn3(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29343); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29344);YearMonth start1 = new YearMonth(2011, 1); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29345);for (int i = 0; (((i < 6)&&(__CLR4_4_1mkxmkxlc8axe3u.R.iget(29346)!=0|true))||(__CLR4_4_1mkxmkxlc8axe3u.R.iget(29347)==0&false)); i++) {{ 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29348);YearMonth start2 = new YearMonth(2011 + i, 1); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29349);YearMonth end = new YearMonth(2011 + i, 3); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29350);assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29351);assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 }}finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testToString843() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6cbuomnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testToString843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6cbuomnc(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29352); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29353);Months test = Months.months(20); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29354);assertEquals("P20M", test.toString()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29355);test = Months.months(-20); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29356);assertEquals("P-20M", test.toString()); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testGetPeriodType860() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0v546mnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testGetPeriodType860",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0v546mnh(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29357); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29358);Months test = Months.months(20); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29359);assertEquals(PeriodType.months(), test.getPeriodType()); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate1061() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uw13npmnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testFactory_monthsBetween_RPartial_LocalDate1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uw13npmnk(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29360); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29361);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29362);LocalDate end1 = new LocalDate(2006, 9, 9); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29363);YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29364);assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29365);assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29366);assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29367);assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29368);assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testIsLessThan1128() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwmjctmnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsLessThan1128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwmjctmnt(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29369); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29370);assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29371);assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29372);assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29373);assertEquals(false, Months.ONE.isLessThan(null)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29374);assertEquals(true, Months.months(-1).isLessThan(null)); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testIsGreaterThan1234() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xar1rcmnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testIsGreaterThan1234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xar1rcmnz(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29375); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29376);assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29377);assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29378);assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29379);assertEquals(true, Months.ONE.isGreaterThan(null)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29380);assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testMultipliedBy_int1246() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwqmeimo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testMultipliedBy_int1246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwqmeimo5(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29381); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29382);Months test = Months.months(2); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29383);assertEquals(6, test.multipliedBy(3).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29384);assertEquals(2, test.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29385);assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29386);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29387);Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29388);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29389);halfMax.multipliedBy(2); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29390);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 


public void testNegated1396() {__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceStart(getClass().getName(),29391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrjjyumof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mkxmkxlc8axe3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mkxmkxlc8axe3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonths.testNegated1396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrjjyumof(){try{__CLR4_4_1mkxmkxlc8axe3u.R.inc(29391); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29392);Months test = Months.months(12); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29393);assertEquals(-12, test.negated().getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29394);assertEquals(12, test.getMonths()); 
     __CLR4_4_1mkxmkxlc8axe3u.R.inc(29395);try { 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29396);Months.MIN_VALUE.negated(); 
         __CLR4_4_1mkxmkxlc8axe3u.R.inc(29397);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1mkxmkxlc8axe3u.R.flushNeeded();}} 

    

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
