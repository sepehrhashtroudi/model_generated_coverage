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
public class TestHours extends TestCase {static class __CLR4_4_1jt0jt0lc8axdus{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,25868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25668);
        __CLR4_4_1jt0jt0lc8axdus.R.inc(25669);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25670);
        __CLR4_4_1jt0jt0lc8axdus.R.inc(25671);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1jt0jt0lc8axdus.R.inc(25673);try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25672);
    }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25674);
    }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25675);
    }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_Hours166() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197id24jt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_Hours166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197id24jt8(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25676); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25677);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25678);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25679);Hours result = test2.plus(test3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25680);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25681);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25682);assertEquals(5, result.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25683);assertEquals(1, Hours.ONE.plus(Hours.ZERO).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25684);assertEquals(1, Hours.ONE.plus((Hours) null).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25685);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25686);Hours.MAX_VALUE.plus(Hours.ONE); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25687);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testFactory_hours_int260() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1421noljtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hours_int260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1421noljtk(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25688); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25689);assertSame(Hours.ZERO, Hours.hours(0)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25690);assertSame(Hours.ONE, Hours.hours(1)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25691);assertSame(Hours.TWO, Hours.hours(2)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25692);assertSame(Hours.THREE, Hours.hours(3)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25693);assertSame(Hours.FOUR, Hours.hours(4)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25694);assertSame(Hours.FIVE, Hours.hours(5)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25695);assertSame(Hours.SIX, Hours.hours(6)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25696);assertSame(Hours.SEVEN, Hours.hours(7)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25697);assertSame(Hours.EIGHT, Hours.hours(8)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25698);assertSame(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25699);assertSame(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25700);assertEquals(-1, Hours.hours(-1).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25701);assertEquals(9, Hours.hours(9).getHours()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToStandardSeconds474() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjwf1jty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardSeconds474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjwf1jty(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25702); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25703);Hours test = Hours.hours(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25704);Seconds expected = Seconds.seconds(3 * 60 * 60); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25705);assertEquals(expected, test.toStandardSeconds()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25706);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25707);Hours.MAX_VALUE.toStandardSeconds(); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25708);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testSerialization566() throws Exception {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jby50eju5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testSerialization566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jby50eju5() throws Exception{try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25709); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25710);Hours test = Hours.SEVEN; 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25711);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25712);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25713);oos.writeObject(test); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25714);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25715);oos.close(); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25716);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25717);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25718);Hours result = (Hours) ois.readObject(); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25719);ois.close(); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25720);assertSame(test, result); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToString575() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otr2asjuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToString575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otr2asjuh(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25721); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25722);Hours test = Hours.hours(20); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25723);assertEquals("PT20H", test.toString()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25724);test = Hours.hours(-20); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25725);assertEquals("PT-20H", test.toString()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToStandardMinutes597() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5q4ljum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardMinutes597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5q4ljum(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25726); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25727);Hours test = Hours.hours(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25728);Minutes expected = Minutes.minutes(3 * 60); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25729);assertEquals(expected, test.toStandardMinutes()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25730);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25731);Hours.MAX_VALUE.toStandardMinutes(); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25732);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testFactory_standardHoursIn_RPeriod616() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gza1ujut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gza1ujut(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25733); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25734);assertEquals(0, Hours.standardHoursIn((ReadablePeriod) null).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25735);assertEquals(0, Hours.standardHoursIn(Period.ZERO).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25736);assertEquals(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25737);assertEquals(123, Hours.standardHoursIn(Period.hours(123)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25738);assertEquals(-987, Hours.standardHoursIn(Period.hours(-987)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25739);assertEquals(1, Hours.standardHoursIn(Period.minutes(119)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25740);assertEquals(2, Hours.standardHoursIn(Period.minutes(120)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25741);assertEquals(2, Hours.standardHoursIn(Period.minutes(121)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25742);assertEquals(48, Hours.standardHoursIn(Period.days(2)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25743);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25744);Hours.standardHoursIn(Period.months(1)); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25745);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testPlus_int677() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twcz8fjv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testPlus_int677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twcz8fjv6(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25746); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25747);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25748);Hours result = test2.plus(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25749);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25750);assertEquals(5, result.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25751);assertEquals(1, Hours.ONE.plus(0).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25752);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25753);Hours.MAX_VALUE.plus(1); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25754);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testMinus_int751() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqj7wjvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_int751",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqj7wjvf(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25755); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25756);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25757);Hours result = test2.minus(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25758);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25759);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25760);assertEquals(1, Hours.ONE.minus(0).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25761);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25762);Hours.MIN_VALUE.minus(1); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25763);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testIsLessThan813() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xn6497jvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsLessThan813",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xn6497jvo(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25764); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25765);assertEquals(false, Hours.THREE.isLessThan(Hours.TWO)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25766);assertEquals(false, Hours.THREE.isLessThan(Hours.THREE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25767);assertEquals(true, Hours.TWO.isLessThan(Hours.THREE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25768);assertEquals(false, Hours.ONE.isLessThan(null)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25769);assertEquals(true, Hours.hours(-1).isLessThan(null)); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testIsGreaterThan842() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ojncyjvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan842",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ojncyjvu(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25770); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25771);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25772);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25773);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25774);assertEquals(true, Hours.ONE.isGreaterThan(null)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25775);assertEquals(false, Hours.hours(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToStandardWeeks850() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu88thjw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardWeeks850",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu88thjw0(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25776); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25777);Hours test = Hours.hours(24 * 7 * 2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25778);Weeks expected = Weeks.weeks(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25779);assertEquals(expected, test.toStandardWeeks()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testMultipliedBy_int857() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13m46lnjw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMultipliedBy_int857",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13m46lnjw4(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25780); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25781);Hours test = Hours.hours(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25782);assertEquals(6, test.multipliedBy(3).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25783);assertEquals(2, test.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25784);assertEquals(-6, test.multipliedBy(-3).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25785);assertSame(test, test.multipliedBy(1)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25786);Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25787);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25788);halfMax.multipliedBy(2); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25789);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToStandardDays1044() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otcdyfjwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays1044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otcdyfjwe(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25790); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25791);Hours test = Hours.hours(24 * 2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25792);Days expected = Days.days(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25793);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testGetFieldType1069() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ir8nbjwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetFieldType1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ir8nbjwi(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25794); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25795);Hours test = Hours.hours(20); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25796);assertEquals(DurationFieldType.hours(), test.getFieldType()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testFactory_hoursBetween_RInstant1124() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uqo3tjwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RInstant1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uqo3tjwl(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25797); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25798);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25799);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25800);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25801);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25802);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25803);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25804);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25805);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testMinus_Hours1207() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci7cgtjwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testMinus_Hours1207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci7cgtjwu(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25806); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25807);Hours test2 = Hours.hours(2); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25808);Hours test3 = Hours.hours(3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25809);Hours result = test2.minus(test3); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25810);assertEquals(2, test2.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25811);assertEquals(3, test3.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25812);assertEquals(-1, result.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25813);assertEquals(1, Hours.ONE.minus(Hours.ZERO).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25814);assertEquals(1, Hours.ONE.minus((Hours) null).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25815);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25816);Hours.MIN_VALUE.minus(Hours.ONE); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25817);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testDividedBy_int1250() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0gjnjx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testDividedBy_int1250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0gjnjx6(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25818); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25819);Hours test = Hours.hours(12); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25820);assertEquals(6, test.dividedBy(2).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25821);assertEquals(12, test.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25822);assertEquals(4, test.dividedBy(3).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25823);assertEquals(3, test.dividedBy(4).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25824);assertEquals(2, test.dividedBy(5).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25825);assertEquals(2, test.dividedBy(6).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25826);assertSame(test, test.dividedBy(1)); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25827);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25828);Hours.ONE.dividedBy(0); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25829);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testFactory_hoursIn_RInterval1439() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kd41bpjxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursIn_RInterval1439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kd41bpjxi(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25830); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25831);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25832);DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25833);DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25834);assertEquals(0, Hours.hoursIn((ReadableInterval) null).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25835);assertEquals(3, Hours.hoursIn(new Interval(start, end1)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25836);assertEquals(0, Hours.hoursIn(new Interval(start, start)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25837);assertEquals(0, Hours.hoursIn(new Interval(end1, end1)).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25838);assertEquals(6, Hours.hoursIn(new Interval(start, end2)).getHours()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testToStandardDuration1452() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7f6itjxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration1452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7f6itjxr(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25839); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25840);Hours test = Hours.hours(20); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25841);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25842);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25843);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25844);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testGetMethods1516() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1im58wujxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testGetMethods1516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1im58wujxx(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25845); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25846);Hours test = Hours.hours(20); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25847);assertEquals(20, test.getHours()); 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testNegated1586() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1180qavjy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testNegated1586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1180qavjy0(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25848); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25849);Hours test = Hours.hours(12); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25850);assertEquals(-12, test.negated().getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25851);assertEquals(12, test.getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25852);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25853);Hours.MIN_VALUE.negated(); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25854);fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 


public void testFactory_parseHours_String1681() {__CLR4_4_1jt0jt0lc8axdus.R.globalSliceStart(getClass().getName(),25855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12c79n6jy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jt0jt0lc8axdus.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jt0jt0lc8axdus.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_parseHours_String1681",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12c79n6jy7(){try{__CLR4_4_1jt0jt0lc8axdus.R.inc(25855); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25856);assertEquals(0, Hours.parseHours((String) null).getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25857);assertEquals(0, Hours.parseHours("PT0H").getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25858);assertEquals(1, Hours.parseHours("PT1H").getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25859);assertEquals(-3, Hours.parseHours("PT-3H").getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25860);assertEquals(2, Hours.parseHours("P0Y0M0DT2H").getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25861);assertEquals(2, Hours.parseHours("PT2H0M").getHours()); 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25862);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25863);Hours.parseHours("P1Y1D"); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25864);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jt0jt0lc8axdus.R.inc(25865);try { 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25866);Hours.parseHours("P1DT1H"); 
         __CLR4_4_1jt0jt0lc8axdus.R.inc(25867);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jt0jt0lc8axdus.R.flushNeeded();}} 

    

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
