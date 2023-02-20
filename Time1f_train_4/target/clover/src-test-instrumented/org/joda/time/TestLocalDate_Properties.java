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
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1kyukyule6rjckj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kyukyule6rjckj.R.inc(27174);
        __CLR4_4_1kyukyule6rjckj.R.inc(27175);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kyukyule6rjckj.R.inc(27176);
        __CLR4_4_1kyukyule6rjckj.R.inc(27177);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1kyukyule6rjckj.R.inc(27179);try{__CLR4_4_1kyukyule6rjckj.R.inc(27178);
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kyukyule6rjckj.R.inc(27180);
        __CLR4_4_1kyukyule6rjckj.R.inc(27181);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kyukyule6rjckj.R.inc(27182);zone = DateTimeZone.getDefault();
        __CLR4_4_1kyukyule6rjckj.R.inc(27183);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1kyukyule6rjckj.R.inc(27184);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1kyukyule6rjckj.R.inc(27185);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kyukyule6rjckj.R.inc(27186);
        __CLR4_4_1kyukyule6rjckj.R.inc(27187);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kyukyule6rjckj.R.inc(27188);DateTimeZone.setDefault(zone);
        __CLR4_4_1kyukyule6rjckj.R.inc(27189);zone = null;
        __CLR4_4_1kyukyule6rjckj.R.inc(27190);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1kyukyule6rjckj.R.inc(27191);systemDefaultLocale = null;
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient493() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v40q9tkzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v40q9tkzc(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27192); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27193);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27194);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27195);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27196);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27197);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27198);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27199);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27200);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27201);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyCompareToMonth719() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ste5ttkzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToMonth719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ste5ttkzm(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27202); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27203);LocalDate test1 = new LocalDate(TEST_TIME1); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27204);LocalDate test2 = new LocalDate(TEST_TIME2); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27205);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27206);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27207);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27208);try { 
         __CLR4_4_1kyukyule6rjckj.R.inc(27209);test1.monthOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1kyukyule6rjckj.R.inc(27210);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyukyule6rjckj.R.inc(27211);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27212);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27213);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27214);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27215);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27216);try { 
         __CLR4_4_1kyukyule6rjckj.R.inc(27217);test1.monthOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1kyukyule6rjckj.R.inc(27218);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyEquals758() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzrq4bl03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzrq4bl03(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27219); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27220);LocalDate test1 = new LocalDate(2005, 11, 8); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27221);LocalDate test2 = new LocalDate(2005, 11, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27222);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27223);assertEquals(false, test1.dayOfMonth().equals(test1.year())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27224);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27225);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27226);assertEquals(false, test1.dayOfMonth().equals(test2.year())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27227);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27228);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27229);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27230);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27231);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27232);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27233);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27234);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27235);assertEquals(false, test1.dayOfMonth().equals(null)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27236);assertEquals(false, test1.dayOfMonth().equals("any")); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27237);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyGetDay760() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfma5xl0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfma5xl0m(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27238); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27239);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27240);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27241);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27242);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27243);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27244);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27245);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27246);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27247);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27248);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27249);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27250);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27251);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27252);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27253);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyAddToCopyYear761() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhczu6l12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhczu6l12(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27254); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27255);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27256);LocalDate copy = test.year().addToCopy(9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27257);check(test, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27258);check(copy, 1981, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27259);copy = test.year().addToCopy(0); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27260);check(copy, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27261);copy = test.year().addToCopy(292278993 - 1972); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27262);check(copy, 292278993, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27263);try { 
         __CLR4_4_1kyukyule6rjckj.R.inc(27264);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1kyukyule6rjckj.R.inc(27265);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyukyule6rjckj.R.inc(27266);check(test, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27267);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27268);check(copy, 0, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27269);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27270);check(copy, -1, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27271);try { 
         __CLR4_4_1kyukyule6rjckj.R.inc(27272);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1kyukyule6rjckj.R.inc(27273);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kyukyule6rjckj.R.inc(27274);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyAddWrapFieldToCopyDay762() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pck36kl1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pck36kl1n(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27275); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27276);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27277);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27278);check(test, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27279);check(copy, 1972, 6, 30); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27280);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27281);check(copy, 1972, 6, 1); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27282);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27283);check(copy, 1972, 6, 27); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27284);test = new LocalDate(1972, 7, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27285);copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27286);check(copy, 1972, 7, 30); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27287);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27288);check(copy, 1972, 7, 31); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27289);copy = test.dayOfMonth().addWrapFieldToCopy(23); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27290);check(copy, 1972, 7, 1); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27291);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27292);check(copy, 1972, 7, 28); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth763() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w66u6l25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth763",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w66u6l25(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27293); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27294);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27295);LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27296);check(test, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27297);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth764() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld531rl2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld531rl2a(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27298); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27299);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27300);LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27301);check(test, 1972, 6, 9); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27302);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict959() {__CLR4_4_1kyukyule6rjckj.R.globalSliceStart(getClass().getName(),27303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3wlzal2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kyukyule6rjckj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kyukyule6rjckj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict959",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3wlzal2f(){try{__CLR4_4_1kyukyule6rjckj.R.inc(27303); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27304);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27305);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27306);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27307);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27308);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27309);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27310);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27311);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1kyukyule6rjckj.R.inc(27312);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1kyukyule6rjckj.R.inc(27313);
        __CLR4_4_1kyukyule6rjckj.R.inc(27314);assertEquals(year, test.getYear());
        __CLR4_4_1kyukyule6rjckj.R.inc(27315);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1kyukyule6rjckj.R.inc(27316);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1kyukyule6rjckj.R.flushNeeded();}}
}
