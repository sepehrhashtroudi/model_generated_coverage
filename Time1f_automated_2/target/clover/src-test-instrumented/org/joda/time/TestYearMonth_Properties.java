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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1k6ok6ole6nl8in{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26160);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26161);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26162);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26163);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1k6ok6ole6nl8in.R.inc(26165);try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26164);
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26166);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26167);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26168);zone = DateTimeZone.getDefault();
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26169);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26170);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26171);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26172);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26173);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26174);DateTimeZone.setDefault(zone);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26175);zone = null;
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26176);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26177);systemDefaultLocale = null;
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGet8() {__CLR4_4_1k6ok6ole6nl8in.R.globalSliceStart(getClass().getName(),26178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5fkytk76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k6ok6ole6nl8in.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k6ok6ole6nl8in.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testGet8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5fkytk76(){try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26178); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26179);MockPartial mock = new MockPartial(); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26180);assertEquals(10, mock.get(DateTimeFieldType.year())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26181);assertEquals(20, mock.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26182);assertEquals(30, mock.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26183);assertEquals(40, mock.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26184);assertEquals(TEST_TIME_NOW, mock.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26185);assertEquals(TEST_TIME_NOW, mock.get(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26186);assertEquals(10, mock.get(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26187);assertEquals(20, mock.get(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26188);assertEquals(30, mock.get(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26189);assertEquals(40, mock.get(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26190);assertEquals(10, mock.get(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26191);assertEquals(20, mock.get(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26192);assertEquals(30, mock.get(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26193);assertEquals(10, mock.get(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26194);assertEquals(10, mock.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26195);assertEquals(10, mock.get(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26196);assertEquals(10, mock.get(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26197);try { 
         __CLR4_4_1k6ok6ole6nl8in.R.inc(26198);mock.get(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1k6ok6ole6nl8in.R.inc(26199);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26200);try { 
         __CLR4_4_1k6ok6ole6nl8in.R.inc(26201);mock.get(null); 
         __CLR4_4_1k6ok6ole6nl8in.R.inc(26202);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}
public void testPropertyEqualsHashCodeLenient174() {__CLR4_4_1k6ok6ole6nl8in.R.globalSliceStart(getClass().getName(),26203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2g01k7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k6ok6ole6nl8in.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k6ok6ole6nl8in.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2g01k7v(){try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26203); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26204);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26205);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26206);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26207);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26208);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26209);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26210);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26211);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26212);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}
public void testPropertyGetMonth175() {__CLR4_4_1k6ok6ole6nl8in.R.globalSliceStart(getClass().getName(),26213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnolhk85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k6ok6ole6nl8in.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k6ok6ole6nl8in.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMonth175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnolhk85(){try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26213); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26214);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26215);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26216);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26217);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26218);assertSame(test, test.monthOfYear().getReadablePartial()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26219);assertSame(test, test.monthOfYear().getYearMonth()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26220);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26221);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26222);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26223);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26224);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26225);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26226);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26227);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26228);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26229);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26230);test = new YearMonth(1972, 7); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26231);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1k6ok6ole6nl8in.R.inc(26232);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1k6ok6ole6nl8in.R.inc(26233);
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26234);assertEquals(year, test.getYear());
        __CLR4_4_1k6ok6ole6nl8in.R.inc(26235);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1k6ok6ole6nl8in.R.flushNeeded();}}
}
