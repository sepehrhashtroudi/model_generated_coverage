/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1p5lp5lle6rjd89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
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

    public static void main(String[] args) {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32601);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32602);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32603);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32604);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1p5lp5lle6rjd89.R.inc(32606);try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32605);
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32607);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32608);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32609);zone = DateTimeZone.getDefault();
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32610);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32611);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32612);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32613);DateTimeZone.setDefault(zone);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32614);zone = null;
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCompareTo13() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vplpdjp5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vplpdjp5z(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32615); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32616);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32617);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32618);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32619);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32620);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32621);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32622);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32623);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32624);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32625);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32626);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32627);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32628);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32629);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32630);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32631);Partial p = new Partial(types, values); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32632);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32633);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32634);test1.compareTo(null); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32635);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32636);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32637);test1.compareTo(new LocalTime()); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32638);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32639);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32640);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32641);new YearMonth(1970, 6).compareTo(partial); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32642);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testIsAfter_YM15() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjsin6p6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjsin6p6r(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32643); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32644);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32645);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32646);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32647);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32648);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32649);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32650);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32651);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32652);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32653);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32654);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32655);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32656);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32657);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32658);new YearMonth(2005, 7).isAfter(null); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32659);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testSerialization361() throws Exception {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cnos7p78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cnos7p78() throws Exception{try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32660); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32661);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32662);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32663);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32664);oos.writeObject(test); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32665);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32666);oos.close(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32667);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32668);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32669);YearMonth result = (YearMonth) ois.readObject(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32670);ois.close(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32671);assertEquals(test, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32672);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32673);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32674);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testGetField362() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thnkp7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thnkp7n(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32675); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32676);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32677);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32678);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32679);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32680);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32681);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32682);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testGetFieldTypes363() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pf7x0p7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pf7x0p7v(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32683); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32684);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32685);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32686);assertEquals(2, fields.length); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32687);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32688);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32689);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono364() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fml5pp82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fml5pp82(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32690); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32691);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32692);YearMonth test = base.withChronologyRetainFields(null); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32693);check(base, 2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32694);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32695);check(test, 2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32696);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testWithField_same365() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jed95ip89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jed95ip89(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32697); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32698);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32699);YearMonth result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32700);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32701);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testWithField366() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kz2sagp8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kz2sagp8e(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32702); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32703);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32704);YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32705);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32706);assertEquals(new YearMonth(2006, 6), result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testPlusYears_int367() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1np0t7lp8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1np0t7lp8j(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32707); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32708);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32709);YearMonth result = test.plusYears(1); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32710);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32711);assertEquals(expected, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32712);result = test.plusYears(0); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32713);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testMinus_RP368() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6ky7xp8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6ky7xp8q(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32714); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32715);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32716);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32717);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32718);assertEquals(expected, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32719);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32720);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testPlus_RP369() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15av844p8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15av844p8x(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32721); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32722);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32723);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32724);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32725);assertEquals(expected, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32726);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32727);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testToInterval370() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14030xtp94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14030xtp94(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32728); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32729);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32730);Interval test = base.toInterval(); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32731);check(base, 2005, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32732);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32733);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32734);Interval expected = new Interval(start, end); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32735);assertEquals(expected, test); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testMinusYears_int371() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7vlbop9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7vlbop9c(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32736); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32737);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32738);YearMonth result = test.minusYears(1); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32739);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32740);assertEquals(expected, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32741);result = test.minusYears(0); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32742);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testMinusMonths_int372() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqb3zgp9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqb3zgp9j(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32743); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32744);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32745);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32746);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32747);assertEquals(expected, result); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32748);result = test.minusMonths(0); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32749);assertSame(test, result); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testWithers373() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dm85rsp9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dm85rsp9q(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32750); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32751);YearMonth test = new YearMonth(1970, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32752);check(test.withYear(2000), 2000, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32753);check(test.withMonthOfYear(2), 1970, 2); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32754);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32755);test.withMonthOfYear(0); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32756);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32757);try { 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32758);test.withMonthOfYear(13); 
         __CLR4_4_1p5lp5lle6rjd89.R.inc(32759);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testToString375() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk1okmpa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk1okmpa0(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32760); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32761);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32762);assertEquals("2002-06", test.toString()); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 


public void testToString_String_Locale376() {__CLR4_4_1p5lp5lle6rjd89.R.globalSliceStart(getClass().getName(),32763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu09hqpa3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p5lp5lle6rjd89.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p5lp5lle6rjd89.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu09hqpa3(){try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32763); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32764);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32765);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32766);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32767);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32768);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1p5lp5lle6rjd89.R.inc(32769);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32770);
            __CLR4_4_1p5lp5lle6rjd89.R.inc(32771);return COPTIC_UTC;
        }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32772);
            __CLR4_4_1p5lp5lle6rjd89.R.inc(32773);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32774);
            __CLR4_4_1p5lp5lle6rjd89.R.inc(32775);return new int[] {1970, 6};
        }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}
    }

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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p5lp5lle6rjd89.R.inc(32776);
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32777);assertEquals(year, test.getYear());
        __CLR4_4_1p5lp5lle6rjd89.R.inc(32778);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p5lp5lle6rjd89.R.flushNeeded();}}
}
