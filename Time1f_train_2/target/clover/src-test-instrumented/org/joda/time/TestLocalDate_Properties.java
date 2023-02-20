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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1ku8ku8le6qsezj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,27156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27008);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27009);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27010);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27011);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1ku8ku8le6qsezj.R.inc(27013);try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27012);
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27014);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27015);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27016);zone = DateTimeZone.getDefault();
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27017);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27018);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27019);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27020);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27021);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27022);DateTimeZone.setDefault(zone);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27023);zone = null;
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27024);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27025);systemDefaultLocale = null;
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient456() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11trnvqkuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11trnvqkuq(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27026); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27027);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27028);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27029);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27030);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27031);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27032);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27033);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27034);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27035);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyCompareToMonth691() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s104vmkv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToMonth691",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s104vmkv0(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27036); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27037);LocalDate test1 = new LocalDate(TEST_TIME1); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27038);LocalDate test2 = new LocalDate(TEST_TIME2); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27039);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27040);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27041);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27042);try { 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27043);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27044);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27045);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27046);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27047);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27048);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27049);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27050);try { 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27051);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27052);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyEquals726() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mov44kvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mov44kvh(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27053); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27054);LocalDate test1 = new LocalDate(2005, 11, 8); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27055);LocalDate test2 = new LocalDate(2005, 11, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27056);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27057);assertEquals(false, test1.dayOfMonth().equals(test1.year())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27058);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27059);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27060);assertEquals(false, test1.dayOfMonth().equals(test2.year())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27061);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27062);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27063);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27064);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27065);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27066);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27067);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27068);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27069);assertEquals(false, test1.dayOfMonth().equals(null)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27070);assertEquals(false, test1.dayOfMonth().equals("any")); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27071);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertySetCopyTextDay727() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4prvokw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4prvokw0(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27072); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27073);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27074);LocalDate copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27075);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27076);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyGetDay730() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vk2xtekw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vk2xtekw5(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27077); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27078);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27079);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27080);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27081);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27082);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27083);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27084);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27085);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27086);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27087);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27088);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27089);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27090);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27091);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27092);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyAddToCopyYear731() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vltnhnkwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vltnhnkwl(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27093); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27094);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27095);LocalDate copy = test.year().addToCopy(9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27096);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27097);check(copy, 1981, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27098);copy = test.year().addToCopy(0); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27099);check(copy, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27100);copy = test.year().addToCopy(292278993 - 1972); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27101);check(copy, 292278993, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27102);try { 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27103);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27104);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27105);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27106);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27107);check(copy, 0, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27108);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27109);check(copy, -1, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27110);try { 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27111);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1ku8ku8le6qsezj.R.inc(27112);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27113);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyAddWrapFieldToCopyDay732() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rk3b53kx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rk3b53kx6(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27114); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27115);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27116);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27117);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27118);check(copy, 1972, 6, 30); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27119);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27120);check(copy, 1972, 6, 1); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27121);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27122);check(copy, 1972, 6, 27); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27123);test = new LocalDate(1972, 7, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27124);copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27125);check(copy, 1972, 7, 30); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27126);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27127);check(copy, 1972, 7, 31); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27128);copy = test.dayOfMonth().addWrapFieldToCopy(23); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27129);check(copy, 1972, 7, 1); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27130);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27131);check(copy, 1972, 7, 28); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth733() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8agtbkxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8agtbkxo(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27132); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27133);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27134);LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27135);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27136);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth734() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjib9wkxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjib9wkxt(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27137); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27138);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27139);LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27140);check(test, 1972, 6, 9); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27141);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict931() {__CLR4_4_1ku8ku8le6qsezj.R.globalSliceStart(getClass().getName(),27142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qilyk4kxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku8ku8le6qsezj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku8ku8le6qsezj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict931",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qilyk4kxy(){try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27142); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27143);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27144);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27145);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27146);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27147);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27148);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27149);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27150);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ku8ku8le6qsezj.R.inc(27151);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1ku8ku8le6qsezj.R.inc(27152);
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27153);assertEquals(year, test.getYear());
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27154);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ku8ku8le6qsezj.R.inc(27155);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1ku8ku8le6qsezj.R.flushNeeded();}}
}
