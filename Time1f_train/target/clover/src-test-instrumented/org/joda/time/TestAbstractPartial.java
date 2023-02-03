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
@java.lang.SuppressWarnings({"fallthrough"}) public class TestAbstractPartial extends TestCase {static class __CLR4_4_1goggoglc8axdke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,21700,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1goggoglc8axdke.R.inc(21616);
        __CLR4_4_1goggoglc8axdke.R.inc(21617);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1goggoglc8axdke.R.inc(21618);
        __CLR4_4_1goggoglc8axdke.R.inc(21619);return new TestSuite(TestAbstractPartial.class);
    }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

    public TestAbstractPartial(String name) {
        super(name);__CLR4_4_1goggoglc8axdke.R.inc(21621);try{__CLR4_4_1goggoglc8axdke.R.inc(21620);
    }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1goggoglc8axdke.R.inc(21622);
        __CLR4_4_1goggoglc8axdke.R.inc(21623);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1goggoglc8axdke.R.inc(21624);zone = DateTimeZone.getDefault();
        __CLR4_4_1goggoglc8axdke.R.inc(21625);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1goggoglc8axdke.R.inc(21626);
        __CLR4_4_1goggoglc8axdke.R.inc(21627);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1goggoglc8axdke.R.inc(21628);DateTimeZone.setDefault(zone);
        __CLR4_4_1goggoglc8axdke.R.inc(21629);zone = null;
    }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetValues225() throws Throwable {__CLR4_4_1goggoglc8axdke.R.globalSliceStart(getClass().getName(),21630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0napigou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggoglc8axdke.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggoglc8axdke.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetValues225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0napigou() throws Throwable{try{__CLR4_4_1goggoglc8axdke.R.inc(21630); 
     __CLR4_4_1goggoglc8axdke.R.inc(21631);MockPartial mock = new MockPartial(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21632);int[] vals = mock.getValues(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21633);assertEquals(2, vals.length); 
     __CLR4_4_1goggoglc8axdke.R.inc(21634);assertEquals(1970, vals[0]); 
     __CLR4_4_1goggoglc8axdke.R.inc(21635);assertEquals(1, vals[1]); 
 }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}} 


public void testGetFieldTypes405() throws Throwable {__CLR4_4_1goggoglc8axdke.R.globalSliceStart(getClass().getName(),21636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6cuo3gp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggoglc8axdke.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggoglc8axdke.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetFieldTypes405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6cuo3gp0() throws Throwable{try{__CLR4_4_1goggoglc8axdke.R.inc(21636); 
     __CLR4_4_1goggoglc8axdke.R.inc(21637);MockPartial mock = new MockPartial(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21638);DateTimeFieldType[] vals = mock.getFieldTypes(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21639);assertEquals(2, vals.length); 
     __CLR4_4_1goggoglc8axdke.R.inc(21640);assertEquals(DateTimeFieldType.year(), vals[0]); 
     __CLR4_4_1goggoglc8axdke.R.inc(21641);assertEquals(DateTimeFieldType.monthOfYear(), vals[1]); 
 }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}} 


public void testGetPropertyEquals1089() throws Throwable {__CLR4_4_1goggoglc8axdke.R.globalSliceStart(getClass().getName(),21642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n0i5dgp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggoglc8axdke.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggoglc8axdke.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetPropertyEquals1089",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n0i5dgp6() throws Throwable{try{__CLR4_4_1goggoglc8axdke.R.inc(21642); 
     __CLR4_4_1goggoglc8axdke.R.inc(21643);MockProperty0 prop0 = new MockProperty0(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21644);assertEquals(true, prop0.equals(prop0)); 
     __CLR4_4_1goggoglc8axdke.R.inc(21645);assertEquals(true, prop0.equals(new MockProperty0())); 
     __CLR4_4_1goggoglc8axdke.R.inc(21646);assertEquals(false, prop0.equals(new MockProperty1())); 
     __CLR4_4_1goggoglc8axdke.R.inc(21647);assertEquals(false, prop0.equals(new MockProperty0Val())); 
     __CLR4_4_1goggoglc8axdke.R.inc(21648);assertEquals(false, prop0.equals(new MockProperty0Field())); 
     __CLR4_4_1goggoglc8axdke.R.inc(21649);assertEquals(false, prop0.equals(new MockProperty0Chrono())); 
     __CLR4_4_1goggoglc8axdke.R.inc(21650);assertEquals(false, prop0.equals("")); 
     __CLR4_4_1goggoglc8axdke.R.inc(21651);assertEquals(false, prop0.equals(null)); 
 }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}} 


public void testGetFieldType1161() throws Throwable {__CLR4_4_1goggoglc8axdke.R.globalSliceStart(getClass().getName(),21652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydie4ygpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1goggoglc8axdke.R.rethrow($CLV_t2$);}finally{__CLR4_4_1goggoglc8axdke.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetFieldType1161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydie4ygpg() throws Throwable{try{__CLR4_4_1goggoglc8axdke.R.inc(21652); 
     __CLR4_4_1goggoglc8axdke.R.inc(21653);MockPartial mock = new MockPartial(); 
     __CLR4_4_1goggoglc8axdke.R.inc(21654);assertEquals(DateTimeFieldType.year(), mock.getFieldType(0)); 
     __CLR4_4_1goggoglc8axdke.R.inc(21655);assertEquals(DateTimeFieldType.monthOfYear(), mock.getFieldType(1)); 
     __CLR4_4_1goggoglc8axdke.R.inc(21656);try { 
         __CLR4_4_1goggoglc8axdke.R.inc(21657);mock.getFieldType(-1); 
         __CLR4_4_1goggoglc8axdke.R.inc(21658);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1goggoglc8axdke.R.inc(21659);try { 
         __CLR4_4_1goggoglc8axdke.R.inc(21660);mock.getFieldType(2); 
         __CLR4_4_1goggoglc8axdke.R.inc(21661);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockPartial extends AbstractPartial {
        
        int[] val = new int[] {1970, 1};
        
        MockPartial() {
            super();__CLR4_4_1goggoglc8axdke.R.inc(21663);try{__CLR4_4_1goggoglc8axdke.R.inc(21662);
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1goggoglc8axdke.R.inc(21664);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1goggoglc8axdke.R.inc(21665);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggoglc8axdke.R.inc(21666);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggoglc8axdke.R.inc(21667);return chrono.year();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggoglc8axdke.R.inc(21668);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggoglc8axdke.R.inc(21669);return chrono.monthOfYear();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1goggoglc8axdke.R.inc(21670);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1goggoglc8axdke.R.inc(21671);throw new IndexOutOfBoundsException();
            }
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

        public int size() {try{__CLR4_4_1goggoglc8axdke.R.inc(21672);
            __CLR4_4_1goggoglc8axdke.R.inc(21673);return 2;
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
        
        public int getValue(int index) {try{__CLR4_4_1goggoglc8axdke.R.inc(21674);
            __CLR4_4_1goggoglc8axdke.R.inc(21675);return val[index];
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

        public void setValue(int index, int value) {try{__CLR4_4_1goggoglc8axdke.R.inc(21676);
            __CLR4_4_1goggoglc8axdke.R.inc(21677);val[index] = value;
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1goggoglc8axdke.R.inc(21678);
            __CLR4_4_1goggoglc8axdke.R.inc(21679);return BuddhistChronology.getInstanceUTC();
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
    
    static class MockProperty0 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();
        public DateTimeField getField() {try{__CLR4_4_1goggoglc8axdke.R.inc(21680);
            __CLR4_4_1goggoglc8axdke.R.inc(21681);return partial.getField(0);
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggoglc8axdke.R.inc(21682);
            __CLR4_4_1goggoglc8axdke.R.inc(21683);return partial;
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
        public int get() {try{__CLR4_4_1goggoglc8axdke.R.inc(21684);
            __CLR4_4_1goggoglc8axdke.R.inc(21685);return partial.getValue(0);
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
    static class MockProperty1 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();
        public DateTimeField getField() {try{__CLR4_4_1goggoglc8axdke.R.inc(21686);
            __CLR4_4_1goggoglc8axdke.R.inc(21687);return partial.getField(1);
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggoglc8axdke.R.inc(21688);
            __CLR4_4_1goggoglc8axdke.R.inc(21689);return partial;
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
        public int get() {try{__CLR4_4_1goggoglc8axdke.R.inc(21690);
            __CLR4_4_1goggoglc8axdke.R.inc(21691);return partial.getValue(1);
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
    static class MockProperty0Field extends MockProperty0 {
        public DateTimeField getField() {try{__CLR4_4_1goggoglc8axdke.R.inc(21692);
            __CLR4_4_1goggoglc8axdke.R.inc(21693);return BuddhistChronology.getInstanceUTC().hourOfDay();
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
    static class MockProperty0Val extends MockProperty0 {
        public int get() {try{__CLR4_4_1goggoglc8axdke.R.inc(21694);
            __CLR4_4_1goggoglc8axdke.R.inc(21695);return 99;
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
    static class MockProperty0Chrono extends MockProperty0 {
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1goggoglc8axdke.R.inc(21696);
            __CLR4_4_1goggoglc8axdke.R.inc(21697);return new MockPartial() {
                public Chronology getChronology() {try{__CLR4_4_1goggoglc8axdke.R.inc(21698);
                    __CLR4_4_1goggoglc8axdke.R.inc(21699);return ISOChronology.getInstanceUTC();
                }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
            };
        }finally{__CLR4_4_1goggoglc8axdke.R.flushNeeded();}}
    }
}
