/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1liklikle6qsf1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1liklikle6qsf1k.R.inc(27884);
        __CLR4_4_1liklikle6qsf1k.R.inc(27885);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1liklikle6qsf1k.R.inc(27886);
        __CLR4_4_1liklikle6qsf1k.R.inc(27887);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1liklikle6qsf1k.R.inc(27889);try{__CLR4_4_1liklikle6qsf1k.R.inc(27888);
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1liklikle6qsf1k.R.inc(27890);
        __CLR4_4_1liklikle6qsf1k.R.inc(27891);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1liklikle6qsf1k.R.inc(27892);zone = DateTimeZone.getDefault();
        __CLR4_4_1liklikle6qsf1k.R.inc(27893);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1liklikle6qsf1k.R.inc(27894);
        __CLR4_4_1liklikle6qsf1k.R.inc(27895);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1liklikle6qsf1k.R.inc(27896);DateTimeZone.setDefault(zone);
        __CLR4_4_1liklikle6qsf1k.R.inc(27897);zone = null;
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlusDays_int4() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123jgl4liy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123jgl4liy(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27898); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27899);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27900);MonthDay result = test.plusDays(1); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27901);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27902);assertEquals(expected, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testWithers379() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vrmz2lj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vrmz2lj3(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27903); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27904);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27905);check(test.withMonthOfYear(5), 5, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27906);check(test.withDayOfMonth(2), 10, 2); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27907);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27908);test.withMonthOfYear(0); 
         __CLR4_4_1liklikle6qsf1k.R.inc(27909);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1liklikle6qsf1k.R.inc(27910);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27911);test.withMonthOfYear(13); 
         __CLR4_4_1liklikle6qsf1k.R.inc(27912);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testProperty403() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u0rc9ljd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u0rc9ljd(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27913); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27914);MonthDay test = new MonthDay(6, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27915);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27916);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27917);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27918);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1liklikle6qsf1k.R.inc(27919);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1liklikle6qsf1k.R.inc(27920);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27921);test.property(null); 
         __CLR4_4_1liklikle6qsf1k.R.inc(27922);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testEqualsHashCode435() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc33m7ljn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc33m7ljn(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27923); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27924);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27925);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27926);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27927);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27928);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27929);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27930);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27931);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27932);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27933);MonthDay test3 = new MonthDay(10, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27934);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27935);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27936);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27937);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27938);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27939);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27940);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27941);assertEquals(true, test1.equals(new MockMD())); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27942);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testToString_String479() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1rmlnlk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1rmlnlk7(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27943); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27944);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27945);assertEquals("05 \ufffd\ufffd", test.toString("MM HH")); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27946);assertEquals("--05-06", test.toString((String) null)); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testSize1254() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufscyilkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize1254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufscyilkb(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27947); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27948);MonthDay test = new MonthDay(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27949);assertEquals(2, test.size()); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testSerialization1258() throws Exception {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iacv07lke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization1258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iacv07lke() throws Exception{try{__CLR4_4_1liklikle6qsf1k.R.inc(27950); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27951);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27952);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27953);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27954);oos.writeObject(test); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27955);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27956);oos.close(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27957);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27958);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27959);MonthDay result = (MonthDay) ois.readObject(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27960);ois.close(); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27961);assertEquals(test, result); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27962);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27963);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27964);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testGetField1259() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c68a5elkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField1259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c68a5elkt(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27965); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27966);MonthDay test = new MonthDay(COPTIC_PARIS); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27967);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27968);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27969);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27970);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1liklikle6qsf1k.R.inc(27971);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27972);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1260() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfe5ukll1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfe5ukll1(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27973); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27974);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27975);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27976);assertSame(base, test); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testWithField_same1261() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6r1d2ll5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same1261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6r1d2ll5(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27977); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27978);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27979);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27980);assertEquals(new MonthDay(9, 6), test); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27981);assertSame(test, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testWithFieldAdded_unknownField1262() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcxeazlla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField1262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcxeazlla(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27982); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27983);MonthDay test = new MonthDay(9, 6); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27984);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(27985);test.withFieldAdded(DurationFieldType.hours(), 6); 
         __CLR4_4_1liklikle6qsf1k.R.inc(27986);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testPlusDays_same1263() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131h7spllf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same1263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131h7spllf(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27987); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27988);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27989);MonthDay result = test.plusDays(0); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27990);assertSame(test, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testMinus_RP1264() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162st6tllj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP1264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162st6tllj(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27991); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27992);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27993);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27994);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27995);assertEquals(expected, result); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27996);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27997);assertSame(test, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testPlus_RP1265() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),27998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayd2s8llq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP1265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayd2s8llq(){try{__CLR4_4_1liklikle6qsf1k.R.inc(27998); 
     __CLR4_4_1liklikle6qsf1k.R.inc(27999);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28000);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28001);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance()); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28002);assertEquals(expected, result); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28003);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28004);assertSame(test, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testPlusMonths_int_wrap1266() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),28005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193n472llx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap1266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193n472llx(){try{__CLR4_4_1liklikle6qsf1k.R.inc(28005); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28006);MonthDay test = new MonthDay(6, 5, ISO_UTC); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28007);MonthDay result = test.plusMonths(10); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28008);MonthDay expected = new MonthDay(4, 5, ISO_UTC); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28009);assertEquals(expected, result); 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 


public void testToLocalDate1267() {__CLR4_4_1liklikle6qsf1k.R.globalSliceStart(getClass().getName(),28010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv6phlm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1liklikle6qsf1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1liklikle6qsf1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate1267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv6phlm2(){try{__CLR4_4_1liklikle6qsf1k.R.inc(28010); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28011);MonthDay base = new MonthDay(6, 6, COPTIC_UTC); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28012);LocalDate test = base.toLocalDate(2009); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28013);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test); 
     __CLR4_4_1liklikle6qsf1k.R.inc(28014);try { 
         __CLR4_4_1liklikle6qsf1k.R.inc(28015);base.toLocalDate(0); 
         __CLR4_4_1liklikle6qsf1k.R.inc(28016);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1liklikle6qsf1k.R.inc(28017);
            __CLR4_4_1liklikle6qsf1k.R.inc(28018);return COPTIC_UTC;
        }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1liklikle6qsf1k.R.inc(28019);
            __CLR4_4_1liklikle6qsf1k.R.inc(28020);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1liklikle6qsf1k.R.inc(28021);
            __CLR4_4_1liklikle6qsf1k.R.inc(28022);return new int[] {10, 6};
        }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1liklikle6qsf1k.R.inc(28023);
        __CLR4_4_1liklikle6qsf1k.R.inc(28024);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1liklikle6qsf1k.R.inc(28025);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1liklikle6qsf1k.R.flushNeeded();}}
}
