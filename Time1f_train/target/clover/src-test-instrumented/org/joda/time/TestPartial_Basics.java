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
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1o2ro2rlc8axeb9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,31416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31203);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31204);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31205);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31206);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1o2ro2rlc8axeb9.R.inc(31208);try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31207);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31209);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31210);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31211);zone = DateTimeZone.getDefault();
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31212);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31213);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31214);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31215);DateTimeZone.setDefault(zone);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31216);zone = null;
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString258() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12x75jyo35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12x75jyo35(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31217); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31218);Partial test = new Partial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31219);assertEquals("[]", test.toString()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWith160() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edx3aeo38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edx3aeo38(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31220); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31221);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31222);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31223);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31224);check(result, 15, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testGetFormatter181() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byh5n9o3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byh5n9o3d(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31225); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31226);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31227);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31228);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31229);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31230);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31231);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31232);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31233);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testGetFieldTypes182() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18v9m1do3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18v9m1do3m(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31234); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31235);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31236);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31237);assertEquals(2, fields.length); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31238);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31239);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31240);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testMinus_RP215() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171dby6o3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171dby6o3t(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31241); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31242);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31243);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31244);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31245);check(result, 9, 19); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31246);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31247);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithFieldAddWrapped8251() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1end5kzo40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1end5kzo40(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31248); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31249);Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31250);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31251);check(test, 0, 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31252);check(result, 23, 59); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31253);test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31254);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31255);check(test, 0, 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31256);check(result, 23, 0); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testToString_String292() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x03ko49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x03ko49(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31257); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31258);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31259);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31260);assertEquals("10:20", test.toString((String) null)); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testSerialization324() throws Exception {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqnz1eo4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqnz1eo4d() throws Exception{try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31261); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31262);Partial test = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31263);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31264);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31265);oos.writeObject(test); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31266);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31267);oos.close(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31268);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31269);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31270);Partial result = (Partial) ois.readObject(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31271);ois.close(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31272);assertEquals(test, result); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31273);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31274);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31275);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWith3f327() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kiqrn8o4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kiqrn8o4s(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31276); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31277);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31278);Partial result = test.with(DateTimeFieldType.era(), 1); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31279);assertEquals(2, result.size()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31280);assertEquals(1, result.get(DateTimeFieldType.era())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31281);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31282);assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31283);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWith4377() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fw7beqo50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fw7beqo50(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31284); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31285);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31286);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31287);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testGetFormatter3440() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwmmk6o54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwmmk6o54(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31288); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31289);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31290);assertEquals("-W-5", test.getFormatter().print(test)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31291);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31292);assertEquals("---13", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWith_argHasNoRange627() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194qzn5o59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194qzn5o59(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31293); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31294);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31295);Partial result = test.with(DateTimeFieldType.year(), 10); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31296);assertEquals(2, result.size()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31297);assertEquals(0, result.indexOf(DateTimeFieldType.year())); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31298);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testToString5670() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wh9oipo5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5670",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wh9oipo5f(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31299); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31300);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31301);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31302);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31303);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithFieldAdded4795() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jexmf0o5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4795",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jexmf0o5k(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31304); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31305);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31306);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31307);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithFieldAddWrapped5814() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7zgxfo5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5814",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7zgxfo5o(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31308); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31309);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31310);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31311);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31312);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31313);check(test, 10, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithField2858() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydkz3mo5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2858",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydkz3mo5u(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31314); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31315);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31316);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31317);test.withField(null, 6); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31318);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31319);check(test, 10, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWith21062() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162oosco60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith21062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162oosco60(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31320); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31321);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31322);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31323);test.with(null, 6); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31324);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31325);check(test, 10, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithFieldAdded11070() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4oyxeo66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded11070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4oyxeo66(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31326); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31327);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31328);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31329);assertEquals(createHourMinPartial(), test); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31330);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31331);check(result, 16, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono1073() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev5phgo6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono1073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev5phgo6c(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31332); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31333);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31334);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31335);assertSame(base, test); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testPlus_RP1193() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opohpuo6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP1193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opohpuo6g(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31336); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31337);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31338);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31339);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31340);check(result, 15, 26); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31341);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31342);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testCompareTo1257() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmfekoo6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo1257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmfekoo6n(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31343); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31344);Partial test1 = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31345);Partial test1a = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31346);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31347);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31348);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31349);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31350);Partial test2 = createHourMinPartial2(ISO_UTC); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31351);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31352);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31353);Partial test3 = createHourMinPartial2(COPTIC_UTC); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31354);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31355);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31356);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31357);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC))); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31358);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31359);test1.compareTo(null); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31360);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31361);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31362);test1.compareTo(new YearMonthDay()); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31363);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31364);try { 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31365);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay()); 
         __CLR4_4_1o2ro2rlc8axeb9.R.inc(31366);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithFieldAddWrapped41280() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9nvdao7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped41280",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9nvdao7b(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31367); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31368);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31369);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31370);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono1307() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjm2mco7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono1307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjm2mco7f(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31371); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31372);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31373);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31374);check(base, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31375);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31376);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31377);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithField11309() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1327by9o7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField11309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1327by9o7m(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31378); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31379);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31380);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31381);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31382);check(result, 15, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithout21354() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k42398o7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout21354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k42398o7r(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31383); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31384);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31385);Partial result = test.without((DateTimeFieldType) null); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31386);check(test, 10, 20); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31387);check(result, 10, 20); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testToString41381() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ro7no8o7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString41381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ro7no8o7w(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31388); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31389);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31390);assertEquals("-W-5", test.toString()); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31391);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31392);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString()); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testWithField41406() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9cdb6o81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField41406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9cdb6o81(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31393); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31394);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31395);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31396);assertSame(test, result); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 


public void testToString_String_Locale1522() {__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceStart(getClass().getName(),31397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w6mvio85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o2ro2rlc8axeb9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o2ro2rlc8axeb9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale1522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w6mvio85(){try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31397); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31398);Partial test = createHourMinPartial(); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31399);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31400);assertEquals("10:20", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31401);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1o2ro2rlc8axeb9.R.inc(31402);assertEquals("10:20", test.toString(null, null)); 
 }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31403);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31404);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31405);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31406);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31407);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31408);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31409);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31410);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31411);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31412);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1o2ro2rlc8axeb9.R.inc(31413);
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31414);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1o2ro2rlc8axeb9.R.inc(31415);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1o2ro2rlc8axeb9.R.flushNeeded();}}
}
