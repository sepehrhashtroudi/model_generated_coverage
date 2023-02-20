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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1n3fn3fle6qe9zb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,30110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29931);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29932);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29933);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29934);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1n3fn3fle6qe9zb.R.inc(29936);try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29935);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29937);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29938);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29939);zone = DateTimeZone.getDefault();
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29940);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29941);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29942);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29943);DateTimeZone.setDefault(zone);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(29944);zone = null;
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization4() throws Exception {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),29945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tujtojn3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tujtojn3t() throws Exception{try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29945); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29946);Partial test = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29947);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29948);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29949);oos.writeObject(test); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29950);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29951);oos.close(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29952);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29953);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29954);Partial result = (Partial) ois.readObject(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29955);ois.close(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29956);assertEquals(test, result); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29957);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29958);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29959);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWith17() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),29960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvp9ejn48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvp9ejn48(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29960); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29961);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29962);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29963);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29964);check(result, 15, 20); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testCompareTo16() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),29965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tkig86n4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tkig86n4d(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29965); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29966);Partial test1 = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29967);Partial test1a = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29968);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29969);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29970);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29971);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29972);Partial test2 = createHourMinPartial2(ISO_UTC); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29973);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29974);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29975);Partial test3 = createHourMinPartial2(COPTIC_UTC); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29976);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29977);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29978);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29979);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC))); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29980);try { 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29981);test1.compareTo(null); 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29982);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29983);try { 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29984);test1.compareTo(new YearMonthDay()); 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29985);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29986);try { 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29987);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay()); 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(29988);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWith3f633() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),29989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uu1qfmn51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uu1qfmn51(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29989); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29990);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29991);Partial result = test.with(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29992);assertEquals(2, result.size()); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29993);assertEquals(1, result.get(DateTimeFieldType.era())); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29994);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29995);assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29996);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testGetFieldTypes635() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),29997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gblkqsn59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gblkqsn59(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(29997); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29998);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(29999);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30000);assertEquals(2, fields.length); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30001);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30002);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30003);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testGetFormatter1644() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evpfjin5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evpfjin5g(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30004); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30005);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30006);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30007);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30008);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30009);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30010);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30011);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30012);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono645() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7c1eyn5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono645",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7c1eyn5p(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30013); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30014);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30015);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30016);check(base, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30017);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30018);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30019);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testGetFormatter3646() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bnsgin5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3646",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bnsgin5w(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30020); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30021);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30022);assertEquals("-W-5", test.getFormatter().print(test)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30023);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30024);assertEquals("---13", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWith4647() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulw0bon61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulw0bon61(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30025); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30026);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30027);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30028);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithout2648() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq6w9nn65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout2648",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq6w9nn65(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30029); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30030);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30031);Partial result = test.without((DateTimeFieldType) null); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30032);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30033);check(result, 10, 20); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithField2649() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6ff2qn6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2649",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6ff2qn6a(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30034); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30035);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30036);try { 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(30037);test.withField(null, 6); 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(30038);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30039);check(test, 10, 20); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithField1650() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17slzahn6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField1650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17slzahn6g(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30040); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30041);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30042);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30043);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30044);check(result, 15, 20); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithField4651() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plnvpjn6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4651",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plnvpjn6l(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30045); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30046);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30047);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30048);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithFieldAdded4652() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13uac58n6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4652",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13uac58n6p(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30049); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30050);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30051);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30052);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithFieldAddWrapped5653() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11y3lx0n6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11y3lx0n6t(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30053); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30054);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30055);try { 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(30056);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1n3fn3fle6qe9zb.R.inc(30057);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30058);check(test, 10, 20); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testWithFieldAddWrapped4654() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jsac2n6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped4654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jsac2n6z(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30059); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30060);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30061);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30062);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testMinus_RP655() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ootxaan73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ootxaan73(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30063); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30064);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30065);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30066);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30067);check(result, 9, 19); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30068);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30069);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testPlus_RP656() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jutyctn7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jutyctn7a(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30070); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30071);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30072);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30073);check(test, 10, 20); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30074);check(result, 15, 26); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30075);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30076);assertSame(test, result); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testToString5658() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1544ap5n7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5658",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1544ap5n7h(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30077); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30078);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30079);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30080);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30081);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testToString_String659() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnnk7ln7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnnk7ln7m(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30082); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30083);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30084);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30085);assertEquals("10:20", test.toString((String) null)); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testToString_String_Locale660() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfaze8n7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfaze8n7q(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30086); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30087);Partial test = createHourMinPartial(); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30088);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30089);assertEquals("10:20", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30090);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30091);assertEquals("10:20", test.toString(null, null)); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 


public void testToString41115() {__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceStart(getClass().getName(),30092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0vba7n7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3fn3fle6qe9zb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3fn3fle6qe9zb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString41115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0vba7n7w(){try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30092); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30093);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30094);assertEquals("-W-5", test.toString()); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30095);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n3fn3fle6qe9zb.R.inc(30096);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString()); 
 }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

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
    

    //-----------------------------------------------------------------------
    private Partial createHourMinPartial() {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30097);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30098);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30099);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30100);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30101);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30102);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30103);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30104);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30105);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30106);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1n3fn3fle6qe9zb.R.inc(30107);
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30108);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1n3fn3fle6qe9zb.R.inc(30109);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1n3fn3fle6qe9zb.R.flushNeeded();}}
}
