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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BaseSingleFieldPeriod;

/**
 * This class is a Junit unit test for BaseSingleFieldPeriod.
 *
 * @author Stephen Colebourne
 */
public class TestBaseSingleFieldPeriod extends TestCase {static class __CLR4_4_1gtmgtmle6np4a9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,21861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21802);
        __CLR4_4_1gtmgtmle6np4a9.R.inc(21803);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21804);
        __CLR4_4_1gtmgtmle6np4a9.R.inc(21805);return new TestSuite(TestBaseSingleFieldPeriod.class);
    }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

    public TestBaseSingleFieldPeriod(String name) {
        super(name);__CLR4_4_1gtmgtmle6np4a9.R.inc(21807);try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21806);
    }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21808);
    }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21809);
    }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testValueIndexMethods191() {__CLR4_4_1gtmgtmle6np4a9.R.globalSliceStart(getClass().getName(),21810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jtmpw1gtu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gtmgtmle6np4a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gtmgtmle6np4a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testValueIndexMethods191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jtmpw1gtu(){try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21810); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21811);Single test = new Single(20); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21812);assertEquals(1, test.size()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21813);assertEquals(20, test.getValue(0)); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21814);try { 
         __CLR4_4_1gtmgtmle6np4a9.R.inc(21815);test.getValue(1); 
         __CLR4_4_1gtmgtmle6np4a9.R.inc(21816);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
public void testToMutablePeriod193() {__CLR4_4_1gtmgtmle6np4a9.R.globalSliceStart(getClass().getName(),21817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sopkgu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gtmgtmle6np4a9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gtmgtmle6np4a9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToMutablePeriod193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sopkgu1(){try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21817); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21818);Single test = new Single(20); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21819);MutablePeriod expected = new MutablePeriod(new Period(0, 0, 0, 1, 0, 0, 0, 0)); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21820);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21821);test = new Single(30); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21822);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21823);test = new Single(31); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21824);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21825);test = new Single(60); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21826);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21827);test = new Single(0); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21828);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21829);test = new Single(1); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21830);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21831);test = new Single(2); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21832);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21833);test = new Single(3); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21834);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21835);test = new Single(4); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21836);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21837);test = new Single(5); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21838);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21839);test = new Single(6); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21840);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21841);test = new Single(7); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21842);assertEquals(expected, test.toMutablePeriod()); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21843);test = new Single(8); 
     __CLR4_4_1gtmgtmle6np4a9.R.inc(21844);assertEquals(expected, test.toMutablePeriod()); 
 }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    

            

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

//    public void testToDurationFrom() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
//    }
//
//    public void testToDurationTo() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
//    }
//

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /** Test class. */
    static class Single extends BaseSingleFieldPeriod {

        public Single(int period) {
            super(period);__CLR4_4_1gtmgtmle6np4a9.R.inc(21846);try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21845);
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21847);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21848);return BaseSingleFieldPeriod.between(start, end, field);
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21849);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21850);return BaseSingleFieldPeriod.between(start, end, zeroInstance);
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21851);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21852);return BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public DurationFieldType getFieldType() {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21853);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21854);return DurationFieldType.days();
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}

        public PeriodType getPeriodType() {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21855);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21856);return PeriodType.days();
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public int getValue() {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21857);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21858);return super.getValue();
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
        
        public void setValue(int value) {try{__CLR4_4_1gtmgtmle6np4a9.R.inc(21859);
            __CLR4_4_1gtmgtmle6np4a9.R.inc(21860);super.setValue(value);
        }finally{__CLR4_4_1gtmgtmle6np4a9.R.flushNeeded();}}
    }

}
