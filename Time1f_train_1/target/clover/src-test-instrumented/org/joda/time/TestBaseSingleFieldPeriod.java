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
public class TestBaseSingleFieldPeriod extends TestCase {static class __CLR4_4_1gv5gv5le6qe95r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21857);
        __CLR4_4_1gv5gv5le6qe95r.R.inc(21858);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21859);
        __CLR4_4_1gv5gv5le6qe95r.R.inc(21860);return new TestSuite(TestBaseSingleFieldPeriod.class);
    }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

    public TestBaseSingleFieldPeriod(String name) {
        super(name);__CLR4_4_1gv5gv5le6qe95r.R.inc(21862);try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21861);
    }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21863);
    }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21864);
    }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_between_RInstant489() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oz1x0xgvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RInstant489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oz1x0xgvd(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21865); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21866);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21867);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21868);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21869);assertEquals(3, Single.between(start, end1, DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21870);assertEquals(0, Single.between(start, start, DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21871);assertEquals(0, Single.between(end1, end1, DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21872);assertEquals(-3, Single.between(end1, start, DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21873);assertEquals(6, Single.between(start, end2, DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21874);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21875);Single.between(start, (ReadableInstant) null, DurationFieldType.days()); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21876);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21877);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21878);Single.between((ReadableInstant) null, end1, DurationFieldType.days()); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21879);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21880);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21881);Single.between((ReadableInstant) null, (ReadableInstant) null, DurationFieldType.days()); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21882);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactory_between_RPartial490() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vio30lgvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RPartial490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vio30lgvv(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21883); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21884);LocalDate start = new LocalDate(2006, 6, 9); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21885);LocalDate end1 = new LocalDate(2006, 6, 12); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21886);YearMonthDay end2 = new YearMonthDay(2006, 6, 15); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21887);Single zero = new Single(0); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21888);assertEquals(3, Single.between(start, end1, zero)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21889);assertEquals(0, Single.between(start, start, zero)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21890);assertEquals(0, Single.between(end1, end1, zero)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21891);assertEquals(-3, Single.between(end1, start, zero)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21892);assertEquals(6, Single.between(start, end2, zero)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21893);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21894);Single.between(start, (ReadablePartial) null, zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21895);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21896);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21897);Single.between((ReadablePartial) null, end1, zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21899);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21900);Single.between((ReadablePartial) null, (ReadablePartial) null, zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21901);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21902);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21903);Single.between(start, new LocalTime(), zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21904);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21905);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21906);Single.between(new Partial(DateTimeFieldType.dayOfWeek(), 2), new Partial(DateTimeFieldType.dayOfMonth(), 3), zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21907);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21908);Partial p = new Partial(new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }, new int[] { 1, 2 }); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21909);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21910);Single.between(p, p, zero); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21911);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testFactory_standardPeriodIn_RPeriod491() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uued9xgwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_standardPeriodIn_RPeriod491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uued9xgwo(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21912); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21913);assertEquals(0, Single.standardPeriodIn((ReadablePeriod) null, DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21914);assertEquals(0, Single.standardPeriodIn(Period.ZERO, DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21915);assertEquals(1, Single.standardPeriodIn(new Period(0, 0, 0, 1, 0, 0, 0, 0), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21916);assertEquals(123, Single.standardPeriodIn(Period.days(123), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21917);assertEquals(-987, Single.standardPeriodIn(Period.days(-987), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21918);assertEquals(1, Single.standardPeriodIn(Period.hours(47), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21919);assertEquals(2, Single.standardPeriodIn(Period.hours(48), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21920);assertEquals(2, Single.standardPeriodIn(Period.hours(49), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21921);assertEquals(14, Single.standardPeriodIn(Period.weeks(2), DateTimeConstants.MILLIS_PER_DAY)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21922);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21923);Single.standardPeriodIn(Period.months(1), DateTimeConstants.MILLIS_PER_DAY); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21924);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testGet492() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtf4pcgx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGet492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtf4pcgx1(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21925); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21926);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21927);assertEquals(0, test.get(DurationFieldType.years())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21928);assertEquals(0, test.get(DurationFieldType.months())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21929);assertEquals(0, test.get(DurationFieldType.weeks())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21930);assertEquals(20, test.get(DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21931);assertEquals(0, test.get(DurationFieldType.hours())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21932);assertEquals(0, test.get(DurationFieldType.minutes())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21933);assertEquals(0, test.get(DurationFieldType.seconds())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21934);assertEquals(0, test.get(DurationFieldType.millis())); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testGetSetValue493() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a1llugxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGetSetValue493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a1llugxb(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21935); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21936);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21937);assertEquals(20, test.getValue()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21938);test.setValue(10); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21939);assertEquals(10, test.getValue()); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testFieldTypeIndexMethods494() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sng9pwgxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFieldTypeIndexMethods494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sng9pwgxg(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21940); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21941);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21942);assertEquals(1, test.size()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21943);assertEquals(DurationFieldType.days(), test.getFieldType(0)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21944);try { 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21945);test.getFieldType(1); 
         __CLR4_4_1gv5gv5le6qe95r.R.inc(21946);fail(); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testToMutablePeriod495() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198jp9gxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToMutablePeriod495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198jp9gxn(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21947); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21948);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21949);MutablePeriod expected = new MutablePeriod(0, 0, 0, 20, 0, 0, 0, 0); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21950);assertEquals(expected, test.toMutablePeriod()); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testIsSupported496() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iieq7ugxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testIsSupported496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iieq7ugxr(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21951); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21952);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21953);assertEquals(false, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21954);assertEquals(false, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21955);assertEquals(false, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21956);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21957);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21958);assertEquals(false, test.isSupported(DurationFieldType.minutes())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21959);assertEquals(false, test.isSupported(DurationFieldType.seconds())); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21960);assertEquals(false, test.isSupported(DurationFieldType.millis())); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testToPeriod497() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vut9x1gy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToPeriod497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vut9x1gy1(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21961); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21962);Single test = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21963);Period expected = Period.days(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21964);assertEquals(expected, test.toPeriod()); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 


public void testEqualsHashCode498() {__CLR4_4_1gv5gv5le6qe95r.R.globalSliceStart(getClass().getName(),21965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inu426gy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gv5gv5le6qe95r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gv5gv5le6qe95r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testEqualsHashCode498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inu426gy5(){try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21965); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21966);Single testA = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21967);Single testB = new Single(20); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21968);assertEquals(true, testA.equals(testB)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21969);assertEquals(true, testB.equals(testA)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21970);assertEquals(true, testA.equals(testA)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21971);assertEquals(true, testB.equals(testB)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21972);assertEquals(true, testA.hashCode() == testB.hashCode()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21973);assertEquals(true, testA.hashCode() == testA.hashCode()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21974);assertEquals(true, testB.hashCode() == testB.hashCode()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21975);Single testC = new Single(30); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21976);assertEquals(false, testA.equals(testC)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21977);assertEquals(false, testB.equals(testC)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21978);assertEquals(false, testC.equals(testA)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21979);assertEquals(false, testC.equals(testB)); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21980);assertEquals(false, testA.hashCode() == testC.hashCode()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21981);assertEquals(false, testB.hashCode() == testC.hashCode()); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21982);assertEquals(true, testA.equals(Days.days(20))); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21983);assertEquals(true, testA.equals(new Period(0, 0, 0, 20, 0, 0, 0, 0, PeriodType.days()))); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21984);assertEquals(false, testA.equals(Period.days(2))); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21985);assertEquals(false, testA.equals("Hello")); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21986);assertEquals(false, testA.equals(Hours.hours(2))); 
     __CLR4_4_1gv5gv5le6qe95r.R.inc(21987);assertEquals(false, testA.equals(null)); 
 }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}} 

    

    

    

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
            super(period);__CLR4_4_1gv5gv5le6qe95r.R.inc(21989);try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21988);
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21990);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(21991);return BaseSingleFieldPeriod.between(start, end, field);
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21992);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(21993);return BaseSingleFieldPeriod.between(start, end, zeroInstance);
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21994);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(21995);return BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public DurationFieldType getFieldType() {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21996);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(21997);return DurationFieldType.days();
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}

        public PeriodType getPeriodType() {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(21998);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(21999);return PeriodType.days();
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public int getValue() {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(22000);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(22001);return super.getValue();
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
        
        public void setValue(int value) {try{__CLR4_4_1gv5gv5le6qe95r.R.inc(22002);
            __CLR4_4_1gv5gv5le6qe95r.R.inc(22003);super.setValue(value);
        }finally{__CLR4_4_1gv5gv5le6qe95r.R.flushNeeded();}}
    }

}
