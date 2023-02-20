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
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1n4gn4gle6rjcwz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,30159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29968);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29969);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29970);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29971);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1n4gn4gle6rjcwz.R.inc(29973);try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29972);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29974);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29975);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29976);zone = DateTimeZone.getDefault();
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29977);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29978);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29979);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29980);DateTimeZone.setDefault(zone);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(29981);zone = null;
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSerialization3() throws Exception {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),29982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3jsh0n4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3jsh0n4u() throws Exception{try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29982); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29983);Partial test = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29984);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29985);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29986);oos.writeObject(test); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29987);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29988);oos.close(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29989);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29990);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29991);Partial result = (Partial) ois.readObject(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29992);ois.close(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29993);assertEquals(test, result); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29994);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29995);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29996);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWith16() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),29997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4p870n59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4p870n59(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(29997); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29998);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(29999);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30000);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30001);check(result, 15, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testCompareTo14() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yylo60n5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yylo60n5e(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30002); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30003);Partial test1 = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30004);Partial test1a = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30005);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30006);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30007);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30008);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30009);Partial test2 = createHourMinPartial2(ISO_UTC); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30010);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30011);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30012);Partial test3 = createHourMinPartial2(COPTIC_UTC); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30013);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30014);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30015);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30016);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC))); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30017);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30018);test1.compareTo(null); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30019);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30020);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30021);test1.compareTo(new YearMonthDay()); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30022);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30023);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30024);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay()); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30025);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testToString2648() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvbii5n62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2648",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvbii5n62(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30026); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30027);Partial test = new Partial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30028);assertEquals("[]", test.toString()); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testGetFieldTypes650() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qv4edxn65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qv4edxn65(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30029); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30030);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30031);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30032);assertEquals(2, fields.length); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30033);assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30034);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30035);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testGetFormatter1656() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lc5ekzn6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1656",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lc5ekzn6c(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30036); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30037);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30038);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30039);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30040);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30041);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30042);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30043);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30044);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono657() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlx6fpn6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlx6fpn6l(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30045); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30046);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30047);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30048);check(base, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30049);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30050);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30051);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono658() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebd2zen6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono658",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebd2zen6s(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30052); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30053);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30054);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30055);assertSame(base, test); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWith2659() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwqhy1n6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith2659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwqhy1n6w(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30056); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30057);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30058);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30059);test.with(null, 6); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30060);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30061);check(test, 10, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWith_argHasNoRange660() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y82saun72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y82saun72(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30062); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30063);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30064);Partial result = test.with(DateTimeFieldType.year(), 10); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30065);assertEquals(2, result.size()); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30066);assertEquals(0, result.indexOf(DateTimeFieldType.year())); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30067);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testGetFormatter3661() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qiqadxn78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3661",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qiqadxn78(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30068); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30069);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30070);assertEquals("-W-5", test.getFormatter().print(test)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30071);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30072);assertEquals("---13", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWith4662() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rhxh9n7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4662",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rhxh9n7d(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30073); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30074);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30075);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30076);assertSame(test, result); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithout2663() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgj2v2n7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout2663",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgj2v2n7h(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30077); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30078);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30079);Partial result = test.without((DateTimeFieldType) null); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30080);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30081);check(result, 10, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithField2664() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnynrpn7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2664",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnynrpn7m(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30082); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30083);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30084);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30085);test.withField(null, 6); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30086);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30087);check(test, 10, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithField4665() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12plek6n7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4665",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12plek6n7s(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30088); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30089);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30090);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30091);assertSame(test, result); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithFieldAdded1666() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obihxmn7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded1666",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obihxmn7w(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30092); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30093);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30094);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30095);assertEquals(createHourMinPartial(), test); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30096);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30097);check(result, 16, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithFieldAdded4667() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swjnmgn82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swjnmgn82(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30098); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30099);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30100);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30101);assertSame(test, result); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithFieldAddWrapped5668() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0cxe8n86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0cxe8n86(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30102); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30103);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30104);try { 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30105);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1n4gn4gle6rjcwz.R.inc(30106);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30107);check(test, 10, 20); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testWithFieldAddWrapped8669() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197b0z6n8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197b0z6n8c(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30108); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30109);Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30110);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30111);check(test, 0, 0); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30112);check(result, 23, 59); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30113);test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30114);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30115);check(test, 0, 0); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30116);check(result, 23, 0); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testMinus_RP670() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihw1ufn8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP670",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihw1ufn8l(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30117); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30118);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30119);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30120);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30121);check(result, 9, 19); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30122);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30123);assertSame(test, result); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testPlus_RP671() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zk4hmn8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP671",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zk4hmn8s(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30124); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30125);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30126);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30127);check(test, 10, 20); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30128);check(result, 15, 26); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30129);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30130);assertSame(test, result); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testToString5674() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh9tctn8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh9tctn8z(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30131); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30132);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30133);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30134);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30135);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testToString_String675() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cs2dpln94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cs2dpln94(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30136); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30137);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30138);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30139);assertEquals("10:20", test.toString((String) null)); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 


public void testToString_String_Locale676() {__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceStart(getClass().getName(),30140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsjpw5n98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n4gn4gle6rjcwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n4gn4gle6rjcwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsjpw5n98(){try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30140); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30141);Partial test = createHourMinPartial(); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30142);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30143);assertEquals("10:20", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30144);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1n4gn4gle6rjcwz.R.inc(30145);assertEquals("10:20", test.toString(null, null)); 
 }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30146);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30147);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30148);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30149);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30150);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30151);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30152);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30153);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30154);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30155);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1n4gn4gle6rjcwz.R.inc(30156);
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30157);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1n4gn4gle6rjcwz.R.inc(30158);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1n4gn4gle6rjcwz.R.flushNeeded();}}
}
