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
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1p6qp6qle6qeaa9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32816,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32642);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32643);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32644);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32645);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1p6qp6qle6qeaa9.R.inc(32647);try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32646);
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32648);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32649);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32650);zone = DateTimeZone.getDefault();
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32651);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32652);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32653);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32654);DateTimeZone.setDefault(zone);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32655);zone = null;
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testCompareTo15() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtif0np74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtif0np74(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32656); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32657);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32658);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32659);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32660);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32661);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32662);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32663);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32664);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32665);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32666);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32667);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32668);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32669);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32670);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32671);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32672);Partial p = new Partial(types, values); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32673);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32674);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32675);test1.compareTo(null); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32676);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32677);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32678);test1.compareTo(new LocalTime()); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32679);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32680);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32681);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32682);new YearMonth(1970, 6).compareTo(partial); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32683);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_invalidInNewChrono353() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fagf9cp7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fagf9cp7w(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32684); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32685);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32686);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32687);base.withChronologyRetainFields(ISO_UTC); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32688);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testSerialization354() throws Exception {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cm7bdxp81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cm7bdxp81() throws Exception{try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32689); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32690);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32691);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32692);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32693);oos.writeObject(test); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32694);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32695);oos.close(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32696);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32697);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32698);YearMonth result = (YearMonth) ois.readObject(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32699);ois.close(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32700);assertEquals(test, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32701);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32702);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32703);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testGetField355() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy1iikp8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy1iikp8g(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32704); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32705);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32706);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32707);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32708);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32709);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32710);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32711);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testGetFieldTypes356() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9fs94p8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9fs94p8o(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32712); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32713);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32714);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32715);assertEquals(2, fields.length); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32716);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32717);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32718);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono357() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5sz6mp8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5sz6mp8v(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32719); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32720);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32721);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32722);assertSame(base, test); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono358() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1da8g7yp8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1da8g7yp8z(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32723); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32724);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32725);YearMonth test = base.withChronologyRetainFields(null); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32726);check(base, 2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32727);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32728);check(test, 2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32729);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testWithField_same359() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12oi7rvp96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12oi7rvp96(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32730); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32731);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32732);YearMonth result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32733);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32734);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testWithField360() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11h2zjmp9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11h2zjmp9b(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32735); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32736);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32737);YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32738);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32739);assertEquals(new YearMonth(2006, 6), result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testPlusYears_int361() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14710grp9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14710grp9g(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32740); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32741);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32742);YearMonth result = test.plusYears(1); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32743);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32744);assertEquals(expected, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32745);result = test.plusYears(0); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32746);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testMinus_RP362() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ol5h3p9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ol5h3p9n(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32747); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32748);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32749);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32750);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32751);assertEquals(expected, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32752);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32753);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testPlus_RP363() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osv0uyp9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osv0uyp9u(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32754); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32755);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32756);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32757);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32758);assertEquals(expected, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32759);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32760);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testToInterval364() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cps0fupa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cps0fupa1(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32761); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32762);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32763);Interval test = base.toInterval(); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32764);check(base, 2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32765);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32766);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32767);Interval expected = new Interval(start, end); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32768);assertEquals(expected, test); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testMinusYears_int365() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3df9tpa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3df9tpa9(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32769); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32770);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32771);YearMonth result = test.minusYears(1); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32772);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32773);assertEquals(expected, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32774);result = test.minusYears(0); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32775);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testMinusMonths_int366() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug65d3pag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug65d3pag(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32776); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32777);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32778);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32779);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32780);assertEquals(expected, result); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32781);result = test.minusMonths(0); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32782);assertSame(test, result); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testProperty367() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thcxzgpan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thcxzgpan(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32783); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32784);YearMonth test = new YearMonth(2005, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32785);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32786);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32787);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32788);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32789);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32790);try { 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32791);test.property(null); 
         __CLR4_4_1p6qp6qle6qeaa9.R.inc(32792);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testToString369() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr7c0vpax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr7c0vpax(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32793); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32794);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32795);assertEquals("2002-06", test.toString()); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testToString_String370() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xmmchpb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xmmchpb0(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32796); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32797);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32798);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32799);assertEquals("2002-06", test.toString((String) null)); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 


public void testToString_String_Locale371() {__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceStart(getClass().getName(),32800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1my3yj1pb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6qp6qle6qeaa9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6qp6qle6qeaa9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1my3yj1pb4(){try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32800); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32801);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32802);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32803);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32804);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32805);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1p6qp6qle6qeaa9.R.inc(32806);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32807);
            __CLR4_4_1p6qp6qle6qeaa9.R.inc(32808);return COPTIC_UTC;
        }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32809);
            __CLR4_4_1p6qp6qle6qeaa9.R.inc(32810);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32811);
            __CLR4_4_1p6qp6qle6qeaa9.R.inc(32812);return new int[] {1970, 6};
        }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}
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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p6qp6qle6qeaa9.R.inc(32813);
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32814);assertEquals(year, test.getYear());
        __CLR4_4_1p6qp6qle6qeaa9.R.inc(32815);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p6qp6qle6qeaa9.R.flushNeeded();}}
}
