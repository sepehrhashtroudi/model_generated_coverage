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
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1n1jn1jle6rcls6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,30017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29863);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29864);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29865);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29866);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1n1jn1jle6rcls6.R.inc(29868);try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29867);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29869);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29870);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29871);zone = DateTimeZone.getDefault();
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29872);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29873);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29874);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29875);DateTimeZone.setDefault(zone);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(29876);zone = null;
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization4() throws Exception {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tujtojn1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tujtojn1x() throws Exception{try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29877); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29878);Partial test = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29879);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29880);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29881);oos.writeObject(test); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29882);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29883);oos.close(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29884);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29885);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29886);Partial result = (Partial) ois.readObject(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29887);ois.close(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29888);assertEquals(test, result); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29889);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29890);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29891);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWith16() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4p870n2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4p870n2c(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29892); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29893);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29894);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29895);check(test, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29896);check(result, 15, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testToString2640() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vbs6dn2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vbs6dn2h(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29897); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29898);Partial test = new Partial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29899);assertEquals("[]", test.toString()); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWith3f642() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dq7dsgn2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dq7dsgn2k(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29900); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29901);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29902);Partial result = test.with(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29903);assertEquals(2, result.size()); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29904);assertEquals(1, result.get(DateTimeFieldType.era())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29905);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29906);assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29907);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testGetFieldTypes644() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a59d0an2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a59d0an2s(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29908); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29909);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29910);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29911);assertEquals(2, fields.length); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29912);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29913);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29914);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testGetFormatter1653() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl5i7kn2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl5i7kn2z(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29915); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29916);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29917);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29918);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29919);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29920);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29921);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29922);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29923);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono654() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xcx2t4n38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xcx2t4n38(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29924); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29925);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29926);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29927);check(base, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29928);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29929);check(test, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29930);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono655() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2czctn3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2czctn3f(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29931); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29932);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29933);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29934);assertSame(base, test); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWith2656() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnqebgn3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith2656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnqebgn3j(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29935); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29936);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29937);try { 
         __CLR4_4_1n1jn1jle6rcls6.R.inc(29938);test.with(null, 6); 
         __CLR4_4_1n1jn1jle6rcls6.R.inc(29939);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29940);check(test, 10, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWith_argHasNoRange657() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r97namn3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r97namn3p(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29941); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29942);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29943);Partial result = test.with(DateTimeFieldType.year(), 10); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29944);assertEquals(2, result.size()); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29945);assertEquals(0, result.indexOf(DateTimeFieldType.year())); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29946);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testGetFormatter3658() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhlfe5n3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3658",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhlfe5n3v(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29947); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29948);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29949);assertEquals("-W-5", test.getFormatter().print(test)); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29950);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29951);assertEquals("---13", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWith4659() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147d7izn40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147d7izn40(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29952); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29953);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29954);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29955);assertSame(test, result); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithout2660() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pj6hnn44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout2660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pj6hnn44(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29956); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29957);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29958);Partial result = test.without((DateTimeFieldType) null); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29959);check(test, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29960);check(result, 10, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithField1661() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9n7cnn49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField1661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9n7cnn49(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29961); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29962);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29963);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29964);check(test, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29965);check(result, 15, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithField4662() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cglaxln4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cglaxln4e(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29966); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29967);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29968);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29969);assertSame(test, result); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithFieldAdded1663() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekilk7n4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded1663",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekilk7n4i(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29970); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29971);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29972);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29973);assertEquals(createHourMinPartial(), test); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29974);check(test, 10, 20); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29975);check(result, 16, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithFieldAdded4664() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdkhz9n4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4664",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdkhz9n4o(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29976); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29977);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29978);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29979);assertSame(test, result); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithFieldAddWrapped5665() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9r87hn4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9r87hn4s(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29980); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29981);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29982);try { 
         __CLR4_4_1n1jn1jle6rcls6.R.inc(29983);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1n1jn1jle6rcls6.R.inc(29984);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29985);check(test, 10, 20); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithFieldAddWrapped8666() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyaxcln4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyaxcln4y(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29986); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29987);Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29988);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29989);check(test, 0, 0); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29990);check(result, 23, 59); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29991);test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29992);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29993);check(test, 0, 0); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29994);check(result, 23, 0); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testWithFieldAddWrapped4667() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z41je8n57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped4667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z41je8n57(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29995); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29996);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29997);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(29998);assertSame(test, result); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 


public void testToString41107() {__CLR4_4_1n1jn1jle6rcls6.R.globalSliceStart(getClass().getName(),29999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsdrqcn5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1jn1jle6rcls6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1jn1jle6rcls6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString41107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsdrqcn5b(){try{__CLR4_4_1n1jn1jle6rcls6.R.inc(29999); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(30000);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(30001);assertEquals("-W-5", test.toString()); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(30002);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n1jn1jle6rcls6.R.inc(30003);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString()); 
 }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30004);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30005);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30006);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30007);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30008);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30009);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30010);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30011);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30012);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30013);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1n1jn1jle6rcls6.R.inc(30014);
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30015);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1n1jn1jle6rcls6.R.inc(30016);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1n1jn1jle6rcls6.R.flushNeeded();}}
}
