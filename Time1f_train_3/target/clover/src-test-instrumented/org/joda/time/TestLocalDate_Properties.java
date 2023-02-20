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
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1kv3kv3le6rcl4d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,27113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27039);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27040);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27041);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27042);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1kv3kv3le6rcl4d.R.inc(27044);try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27043);
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27045);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27046);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27047);zone = DateTimeZone.getDefault();
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27048);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27049);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27050);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27051);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27052);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27053);DateTimeZone.setDefault(zone);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27054);zone = null;
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27055);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27056);systemDefaultLocale = null;
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient493() {__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceStart(getClass().getName(),27057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v40q9tkvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kv3kv3le6rcl4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v40q9tkvl(){try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27057); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27058);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27059);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27060);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27061);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27062);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27063);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27064);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27065);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27066);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}} 


public void testPropertySetCopyTextDay741() {__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceStart(getClass().getName(),27067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyo9r8kvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kv3kv3le6rcl4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay741",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyo9r8kvv(){try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27067); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27068);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27069);LocalDate copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27070);check(test, 1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27071);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}} 


public void testPropertyGetDay744() {__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceStart(getClass().getName(),27072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5rtw1kw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kv3kv3le6rcl4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5rtw1kw0(){try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27072); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27073);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27074);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27075);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27076);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27077);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27078);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27079);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27080);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27081);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27082);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27083);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27084);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27085);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27086);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27087);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}} 


public void testPropertyAddToCopyYear745() {__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceStart(getClass().getName(),27088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4147skwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kv3kv3le6rcl4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kv3kv3le6rcl4d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4147skwg(){try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27088); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27089);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27090);LocalDate copy = test.year().addToCopy(9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27091);check(test, 1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27092);check(copy, 1981, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27093);copy = test.year().addToCopy(0); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27094);check(copy, 1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27095);copy = test.year().addToCopy(292278993 - 1972); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27096);check(copy, 292278993, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27097);try { 
         __CLR4_4_1kv3kv3le6rcl4d.R.inc(27098);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1kv3kv3le6rcl4d.R.inc(27099);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27100);check(test, 1972, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27101);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27102);check(copy, 0, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27103);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27104);check(copy, -1, 6, 9); 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27105);try { 
         __CLR4_4_1kv3kv3le6rcl4d.R.inc(27106);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1kv3kv3le6rcl4d.R.inc(27107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kv3kv3le6rcl4d.R.inc(27108);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1kv3kv3le6rcl4d.R.inc(27109);
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27110);assertEquals(year, test.getYear());
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27111);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kv3kv3le6rcl4d.R.inc(27112);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1kv3kv3le6rcl4d.R.flushNeeded();}}
}
