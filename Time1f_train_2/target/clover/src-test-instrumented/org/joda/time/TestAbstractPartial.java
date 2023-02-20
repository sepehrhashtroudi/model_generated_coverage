/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import org.joda.time.base.AbstractPartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestAbstractPartial extends TestCase {static class __CLR4_4_1goggogle6qseli{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,21684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1goggogle6qseli.R.inc(21616);
        __CLR4_4_1goggogle6qseli.R.inc(21617);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1goggogle6qseli.R.inc(21618);
        __CLR4_4_1goggogle6qseli.R.inc(21619);return new TestSuite(TestAbstractPartial.class);
    }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

    public TestAbstractPartial(String name) {
        super(name);__CLR4_4_1goggogle6qseli.R.inc(21621);try{__CLR4_4_1goggogle6qseli.R.inc(21620);
    }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1goggogle6qseli.R.inc(21622);
        __CLR4_4_1goggogle6qseli.R.inc(21623);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1goggogle6qseli.R.inc(21624);zone = DateTimeZone.getDefault();
        __CLR4_4_1goggogle6qseli.R.inc(21625);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1goggogle6qseli.R.inc(21626);
        __CLR4_4_1goggogle6qseli.R.inc(21627);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1goggogle6qseli.R.inc(21628);DateTimeZone.setDefault(zone);
        __CLR4_4_1goggogle6qseli.R.inc(21629);zone = null;
    }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetFieldType1() throws Throwable {__CLR4_4_1goggogle6qseli.R.globalSliceStart(getClass().getName(),21630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr1rm0gou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggogle6qseli.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggogle6qseli.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetFieldType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr1rm0gou() throws Throwable{try{__CLR4_4_1goggogle6qseli.R.inc(21630); 
     __CLR4_4_1goggogle6qseli.R.inc(21631);MockPartial mock = new MockPartial(); 
     __CLR4_4_1goggogle6qseli.R.inc(21632);assertEquals(DateTimeFieldType.year(), mock.getFieldType(0)); 
     __CLR4_4_1goggogle6qseli.R.inc(21633);assertEquals(DateTimeFieldType.monthOfYear(), mock.getFieldType(1)); 
     __CLR4_4_1goggogle6qseli.R.inc(21634);try { 
         __CLR4_4_1goggogle6qseli.R.inc(21635);mock.getFieldType(-1); 
         __CLR4_4_1goggogle6qseli.R.inc(21636);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1goggogle6qseli.R.inc(21637);try { 
         __CLR4_4_1goggogle6qseli.R.inc(21638);mock.getFieldType(2); 
         __CLR4_4_1goggogle6qseli.R.inc(21639);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}} 


public void testGetValues2() throws Throwable {__CLR4_4_1goggogle6qseli.R.globalSliceStart(getClass().getName(),21640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116yqr1gp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggogle6qseli.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggogle6qseli.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetValues2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116yqr1gp4() throws Throwable{try{__CLR4_4_1goggogle6qseli.R.inc(21640); 
     __CLR4_4_1goggogle6qseli.R.inc(21641);MockPartial mock = new MockPartial(); 
     __CLR4_4_1goggogle6qseli.R.inc(21642);int[] vals = mock.getValues(); 
     __CLR4_4_1goggogle6qseli.R.inc(21643);assertEquals(2, vals.length); 
     __CLR4_4_1goggogle6qseli.R.inc(21644);assertEquals(1970, vals[0]); 
     __CLR4_4_1goggogle6qseli.R.inc(21645);assertEquals(1, vals[1]); 
 }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockPartial extends AbstractPartial {
        
        int[] val = new int[] {1970, 1};
        
        MockPartial() {
            super();__CLR4_4_1goggogle6qseli.R.inc(21647);try{__CLR4_4_1goggogle6qseli.R.inc(21646);
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1goggogle6qseli.R.inc(21648);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1goggogle6qseli.R.inc(21649);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggogle6qseli.R.inc(21650);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggogle6qseli.R.inc(21651);return chrono.year();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggogle6qseli.R.inc(21652);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggogle6qseli.R.inc(21653);return chrono.monthOfYear();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggogle6qseli.R.inc(21654);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggogle6qseli.R.inc(21655);throw new IndexOutOfBoundsException();
            }
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

        public int size() {try{__CLR4_4_1goggogle6qseli.R.inc(21656);
            __CLR4_4_1goggogle6qseli.R.inc(21657);return 2;
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
        
        public int getValue(int index) {try{__CLR4_4_1goggogle6qseli.R.inc(21658);
            __CLR4_4_1goggogle6qseli.R.inc(21659);return val[index];
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

        public void setValue(int index, int value) {try{__CLR4_4_1goggogle6qseli.R.inc(21660);
            __CLR4_4_1goggogle6qseli.R.inc(21661);val[index] = value;
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1goggogle6qseli.R.inc(21662);
            __CLR4_4_1goggogle6qseli.R.inc(21663);return BuddhistChronology.getInstanceUTC();
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
    
    static class MockProperty0 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();
        public DateTimeField getField() {try{__CLR4_4_1goggogle6qseli.R.inc(21664);
            __CLR4_4_1goggogle6qseli.R.inc(21665);return partial.getField(0);
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggogle6qseli.R.inc(21666);
            __CLR4_4_1goggogle6qseli.R.inc(21667);return partial;
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
        public int get() {try{__CLR4_4_1goggogle6qseli.R.inc(21668);
            __CLR4_4_1goggogle6qseli.R.inc(21669);return partial.getValue(0);
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
    static class MockProperty1 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();
        public DateTimeField getField() {try{__CLR4_4_1goggogle6qseli.R.inc(21670);
            __CLR4_4_1goggogle6qseli.R.inc(21671);return partial.getField(1);
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggogle6qseli.R.inc(21672);
            __CLR4_4_1goggogle6qseli.R.inc(21673);return partial;
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
        public int get() {try{__CLR4_4_1goggogle6qseli.R.inc(21674);
            __CLR4_4_1goggogle6qseli.R.inc(21675);return partial.getValue(1);
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
    static class MockProperty0Field extends MockProperty0 {
        public DateTimeField getField() {try{__CLR4_4_1goggogle6qseli.R.inc(21676);
            __CLR4_4_1goggogle6qseli.R.inc(21677);return BuddhistChronology.getInstanceUTC().hourOfDay();
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
    static class MockProperty0Val extends MockProperty0 {
        public int get() {try{__CLR4_4_1goggogle6qseli.R.inc(21678);
            __CLR4_4_1goggogle6qseli.R.inc(21679);return 99;
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
    static class MockProperty0Chrono extends MockProperty0 {
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggogle6qseli.R.inc(21680);
            __CLR4_4_1goggogle6qseli.R.inc(21681);return new MockPartial() {
                public Chronology getChronology() {try{__CLR4_4_1goggogle6qseli.R.inc(21682);
                    __CLR4_4_1goggogle6qseli.R.inc(21683);return ISOChronology.getInstanceUTC();
                }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
            };
        }finally{__CLR4_4_1goggogle6qseli.R.flushNeeded();}}
    }
}
