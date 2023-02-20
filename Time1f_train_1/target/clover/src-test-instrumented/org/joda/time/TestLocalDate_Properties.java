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
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1kw7kw7le6qe9oj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27079);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27080);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27081);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27082);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1kw7kw7le6qe9oj.R.inc(27084);try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27083);
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27085);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27086);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27087);zone = DateTimeZone.getDefault();
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27088);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27089);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27090);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27091);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27092);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27093);DateTimeZone.setDefault(zone);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27094);zone = null;
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27095);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27096);systemDefaultLocale = null;
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient482() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16y8gdbkwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16y8gdbkwp(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27097); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27098);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27099);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27100);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27101);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27102);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27103);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27104);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27105);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27106);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyCompareToMonth708() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198v0tbkwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToMonth708",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198v0tbkwz(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27107); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27108);LocalDate test1 = new LocalDate(TEST_TIME1); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27109);LocalDate test2 = new LocalDate(TEST_TIME2); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27110);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27111);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27112);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27113);try { 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27114);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27115);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27116);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27117);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27118);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27119);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27120);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27121);try { 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27122);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27123);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyEquals741() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh2xyjkxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh2xyjkxg(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27124); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27125);LocalDate test1 = new LocalDate(2005, 11, 8); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27126);LocalDate test2 = new LocalDate(2005, 11, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27127);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27128);assertEquals(false, test1.dayOfMonth().equals(test1.year())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27129);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27130);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27131);assertEquals(false, test1.dayOfMonth().equals(test2.year())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27132);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27133);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27134);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27135);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27136);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27137);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27138);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27139);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27140);assertEquals(false, test1.dayOfMonth().equals(null)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27141);assertEquals(false, test1.dayOfMonth().equals("any")); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27142);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertySetCopyTextDay742() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpoayrkxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpoayrkxz(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27143); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27144);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27145);LocalDate copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27146);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27147);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyGetDay744() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5rtw1ky4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5rtw1ky4(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27148); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27149);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27150);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27151);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27152);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27153);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27154);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27155);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27156);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27157);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27158);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27159);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27160);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27161);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27162);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27163);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyAddToCopyYear745() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4147skyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4147skyk(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27164); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27165);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27166);LocalDate copy = test.year().addToCopy(9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27167);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27168);check(copy, 1981, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27169);copy = test.year().addToCopy(0); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27170);check(copy, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27171);copy = test.year().addToCopy(292278993 - 1972); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27172);check(copy, 292278993, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27173);try { 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27174);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27175);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27176);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27177);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27178);check(copy, 0, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27179);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27180);check(copy, -1, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27181);try { 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27182);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1kw7kw7le6qe9oj.R.inc(27183);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27184);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyAddWrapFieldToCopyDay746() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5z4mkz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay746",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5z4mkz5(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27185); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27186);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27187);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27188);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27189);check(copy, 1972, 6, 30); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27190);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27191);check(copy, 1972, 6, 1); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27192);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27193);check(copy, 1972, 6, 27); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27194);test = new LocalDate(1972, 7, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27195);copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27196);check(copy, 1972, 7, 30); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27197);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27198);check(copy, 1972, 7, 31); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27199);copy = test.dayOfMonth().addWrapFieldToCopy(23); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27200);check(copy, 1972, 7, 1); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27201);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27202);check(copy, 1972, 7, 28); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth747() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rhkaw4kzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth747",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rhkaw4kzn(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27203); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27204);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27205);LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27206);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27207);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth748() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1389107kzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth748",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1389107kzs(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27208); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27209);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27210);LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27211);check(test, 1972, 6, 9); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27212);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict946() {__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceStart(getClass().getName(),27213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gcn2wkzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kw7kw7le6qe9oj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kw7kw7le6qe9oj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict946",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gcn2wkzx(){try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27213); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27214);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27215);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27216);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27217);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27218);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27219);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27220);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27221);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kw7kw7le6qe9oj.R.inc(27222);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1kw7kw7le6qe9oj.R.inc(27223);
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27224);assertEquals(year, test.getYear());
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27225);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kw7kw7le6qe9oj.R.inc(27226);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1kw7kw7le6qe9oj.R.flushNeeded();}}
}
