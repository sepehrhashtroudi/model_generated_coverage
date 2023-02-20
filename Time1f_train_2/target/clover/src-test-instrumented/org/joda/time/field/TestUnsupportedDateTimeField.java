/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.field;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;

/**
 * This class is a JUnit test to test only the UnsupportedDateTimeField class.
 * This set of test cases exercises everything described in the Javadoc for this
 * class.
 * 
 * @author Jeremy R. Rickard
 */
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_1sf5sf5le6qsflp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,37055,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36833);
        __CLR4_4_1sf5sf5le6qsflp.R.inc(36834);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36835);
        __CLR4_4_1sf5sf5le6qsflp.R.inc(36836);weeks = DurationFieldType.weeks();
        __CLR4_4_1sf5sf5le6qsflp.R.inc(36837);months = DurationFieldType.months();
        __CLR4_4_1sf5sf5le6qsflp.R.inc(36838);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_1sf5sf5le6qsflp.R.inc(36839);localTime = new LocalTime();
    }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testAlwaysFalseReturnTypes916() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),36840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1er1d8isfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes916",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1er1d8isfc(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36840); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36841);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36842);assertFalse(fieldOne.isLenient()); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36843);assertFalse(fieldOne.isSupported()); 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 


public void testDelegatedMethods917() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),36844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao0oblsfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods917",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao0oblsfg(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36844); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36845);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36846);PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36847);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36848);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36849);fieldOne.add(System.currentTimeMillis(), 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36850);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36851);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36852);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36853);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36854);long firstComputation = hoursDuration.add(currentTime, 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36855);long secondComputation = fieldTwo.add(currentTime, 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36856);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36857);assertTrue(false); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36858);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36859);fieldOne.add(System.currentTimeMillis(), 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36860);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36861);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36862);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36863);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36864);long firstComputation = hoursDuration.add(currentTime, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36865);long secondComputation = fieldTwo.add(currentTime, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36866);assertTrue(firstComputation == secondComputation); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36867);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36868);assertTrue(false); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36869);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36870);fieldOne.getDifference(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36871);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36872);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36873);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36874);int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36875);int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36876);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36877);assertTrue(false); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36878);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36879);fieldOne.getDifferenceAsLong(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36880);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36881);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36882);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36883);long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36884);long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36885);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36886);assertTrue(false); 
     } 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 


public void testNullValuesToGetInstanceThrowsException918() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),36887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elt6x2sgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException918",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elt6x2sgn(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36887); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36888);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36889);UnsupportedDateTimeField.getInstance(null, null); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36890);assertTrue(false); 
     } catch (IllegalArgumentException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36891);assertTrue(true); 
     } 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 


public void testUnsupportedMethods919() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),36892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13y7g9zsgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testUnsupportedMethods919",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13y7g9zsgs(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(36892); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36893);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36894);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36895);fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36896);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36897);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36898);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36899);fieldOne.addWrapField(100000L, 250); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36900);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36901);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36902);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36903);fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36904);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36905);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36906);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36907);fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36908);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36909);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36910);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36911);fieldOne.get(1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36912);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36913);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36914);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36915);fieldOne.getAsShortText(0, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36916);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36917);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36918);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36919);fieldOne.getAsShortText(100000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36920);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36921);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36922);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36923);fieldOne.getAsShortText(100000L, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36924);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36925);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36926);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36927);fieldOne.getAsShortText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36928);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36929);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36930);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36931);fieldOne.getAsShortText(localTime, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36932);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36933);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36934);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36935);fieldOne.getAsText(0, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36936);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36937);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36938);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36939);fieldOne.getAsText(1000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36940);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36941);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36942);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36943);fieldOne.getAsText(1000L, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36944);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36945);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36946);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36947);fieldOne.getAsText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36948);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36949);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36950);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36951);fieldOne.getAsText(localTime, Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36952);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36953);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36954);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36955);fieldOne.getLeapAmount(System.currentTimeMillis()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36956);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36957);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36958);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36959);fieldOne.getMaximumShortTextLength(Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36960);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36961);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36962);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36963);fieldOne.getMaximumTextLength(Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36964);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36965);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36966);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36967);fieldOne.getMaximumValue(); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36968);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36969);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36970);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36971);fieldOne.getMaximumValue(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36972);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36973);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36974);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36975);fieldOne.getMaximumValue(localTime); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36976);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36977);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36978);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36979);fieldOne.getMaximumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36980);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36981);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36982);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36983);fieldOne.getMinimumValue(); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36984);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36985);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36986);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36987);fieldOne.getMinimumValue(10000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36988);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36989);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36990);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36991);fieldOne.getMinimumValue(localTime); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36992);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36993);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36994);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36995);fieldOne.getMinimumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36996);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36997);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(36998);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(36999);fieldOne.isLeap(System.currentTimeMillis()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37000);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37001);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37002);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37003);fieldOne.remainder(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37004);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37005);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37006);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37007);fieldOne.roundCeiling(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37008);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37009);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37010);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37011);fieldOne.roundFloor(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37012);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37013);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37014);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37015);fieldOne.roundHalfCeiling(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37016);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37017);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37018);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37019);fieldOne.roundHalfEven(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37020);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37021);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37022);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37023);fieldOne.roundHalfFloor(1000000L); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37024);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37025);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37026);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37027);fieldOne.set(1000000L, 1000); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37028);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37029);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37030);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37031);fieldOne.set(1000000L, "Unsupported Operation"); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37032);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37033);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37034);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37035);fieldOne.set(1000000L, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37036);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37037);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37038);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37039);fieldOne.set(localTime, 0, new int[] { 0 }, 10000); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37040);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37041);assertTrue(true); 
     } 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37042);try { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37043);fieldOne.set(localTime, 0, new int[] { 0 }, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37044);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sf5sf5le6qsflp.R.inc(37045);assertTrue(true); 
     } 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 


public void testMethodsThatShouldAlwaysReturnNull920() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),37046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u85elasl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull920",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u85elasl2(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(37046); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37047);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37048);assertNull(fieldOne.getLeapDurationField()); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37049);assertNull(fieldOne.getRangeDurationField()); 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 


public void testToString921() {__CLR4_4_1sf5sf5le6qsflp.R.globalSliceStart(getClass().getName(),37050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4vyapsl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sf5sf5le6qsflp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sf5sf5le6qsflp.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString921",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4vyapsl6(){try{__CLR4_4_1sf5sf5le6qsflp.R.inc(37050); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37051);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37052);String debugMessage = fieldOne.toString(); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37053);assertNotNull(debugMessage); 
     __CLR4_4_1sf5sf5le6qsflp.R.inc(37054);assertTrue(debugMessage.length() > 0); 
 }finally{__CLR4_4_1sf5sf5le6qsflp.R.flushNeeded();}} 

    

    /**
     * 
     * This test exercises the logic in UnsupportedDateTimeField.getInstance. If
     * getInstance() is invoked twice with: - the same DateTimeFieldType -
     * different duration fields
     * 
     * Then the field returned in the first invocation should not be equal to
     * the field returned by the second invocation. In otherwords, the generated
     * instance should be the same for a unique pairing of
     * DateTimeFieldType/DurationField
     */
    

    /**
     * The getName() method should return the same value as the getName() method
     * of the DateTimeFieldType that was used to create the instance.
     * 
     */
    

    /**
     * As this is an unsupported date/time field, some normal methods will
     * always return false, as they are not supported. Verify that each method
     * correctly returns null.
     */
    

    /**
     * According to the JavaDocs, there are two methods that should always
     * return null. * getRangeDurationField() * getLeapDurationField()
     * 
     * Ensure that these are in fact null.
     */

    

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported and throw an UnsupportedOperationException. Verify that each
     * method correctly throws this exception. * add(ReadablePartial instant,
     * int fieldIndex, int[] values, int valueToAdd) * addWrapField(long
     * instant, int value) * addWrapField(ReadablePartial instant, int
     * fieldIndex, int[] values, int valueToAdd) *
     * addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int
     * valueToAdd) * get(long instant) * getAsShortText(int fieldValue, Locale
     * locale) * getAsShortText(long instant) * getAsShortText(long instant,
     * Locale locale) * getAsShortText(ReadablePartial partial, int fieldValue,
     * Locale locale) * getAsShortText(ReadablePartial partial, Locale locale) *
     * getAsText(int fieldValue, Locale locale) * getAsText(long instant) *
     * getAsText(long instant, Locale locale) * getAsText(ReadablePartial
     * partial, int fieldValue, Locale locale) * getAsText(ReadablePartial
     * partial, Locale locale) * getLeapAmount(long instant) *
     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
     * locale) * getMaximumValue() * getMaximumValue(long instant) *
     * getMaximumValue(ReadablePartial instant) *
     * getMaximumValue(ReadablePartial instant, int[] values) *
     * getMinimumValue() * getMinimumValue(long instant) *
     * getMinimumValue(ReadablePartial instant) *
     * getMinimumValue(ReadablePartial instant, int[] values) * isLeap(long
     * instant) * remainder(long instant) * roundCeiling(long instant) *
     * roundFloor(long instant) * roundHalfCeiling(long instant) *
     * roundHalfEven(long instant) * roundHalfFloor(long instant) * set(long
     * instant, int value) * set(long instant, String text) * set(long instant,
     * String text, Locale locale) * set(ReadablePartial instant, int
     * fieldIndex, int[] values, int newValue) * set(ReadablePartial instant,
     * int fieldIndex, int[] values, String text, Locale locale)
     */
    

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported. Some delegate and can possibly throw an
     * UnsupportedOperationException or have a valid return. Verify that each
     * method correctly throws this exception when appropriate and delegates
     * correctly based on the Duration used to get the instance.
     */
    

    /**
    * The toString method should return a suitable debug message (not null).
    * Ensure that the toString method returns a string with length greater than
    * 0 (and not null)
    * 
    */
    
}
