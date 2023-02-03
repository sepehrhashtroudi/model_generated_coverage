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
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1lkdlkdlc8axe0o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,28080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27949);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27950);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27951);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27952);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1lkdlkdlc8axe0o.R.inc(27954);try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27953);
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27955);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27956);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27957);zone = DateTimeZone.getDefault();
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27958);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27959);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27960);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27961);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27962);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27963);DateTimeZone.setDefault(zone);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27964);zone = null;
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27965);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(27966);systemDefaultLocale = null;
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient184() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),27967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jusgjilkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jusgjilkv(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27967); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27968);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27969);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27970);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27971);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27972);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27973);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27974);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27975);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27976);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyEquals521() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),27977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1clzbcbll5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1clzbcbll5(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27977); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27978);LocalDate test1 = new LocalDate(2005, 11, 8); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27979);LocalDate test2 = new LocalDate(2005, 11, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27980);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27981);assertEquals(false, test1.dayOfMonth().equals(test1.year())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27982);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27983);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27984);assertEquals(false, test1.dayOfMonth().equals(test2.year())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27985);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27986);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27987);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27988);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27989);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27990);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27991);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27992);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27993);assertEquals(false, test1.dayOfMonth().equals(null)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27994);assertEquals(false, test1.dayOfMonth().equals("any")); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27995);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyWithMinimumValueDayOfMonth544() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),27996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m09s8vllo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m09s8vllo(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(27996); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27997);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27998);LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(27999);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28000);check(copy, 1972, 6, 1); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertySetCopyTextDay801() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1139j5tllt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1139j5tllt(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28001); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28002);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28003);LocalDate copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28004);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28005);check(copy, 1972, 6, 12); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyAddToCopyYear1095() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wn3rrlly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear1095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wn3rrlly(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28006); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28007);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28008);LocalDate copy = test.year().addToCopy(9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28009);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28010);check(copy, 1981, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28011);copy = test.year().addToCopy(0); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28012);check(copy, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28013);copy = test.year().addToCopy(292278993 - 1972); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28014);check(copy, 292278993, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28015);try { 
         __CLR4_4_1lkdlkdlc8axe0o.R.inc(28016);test.year().addToCopy(292278993 - 1972 + 1); 
         __CLR4_4_1lkdlkdlc8axe0o.R.inc(28017);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28018);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28019);copy = test.year().addToCopy(-1972); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28020);check(copy, 0, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28021);copy = test.year().addToCopy(-1973); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28022);check(copy, -1, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28023);try { 
         __CLR4_4_1lkdlkdlc8axe0o.R.inc(28024);test.year().addToCopy(-292275054 - 1972 - 1); 
         __CLR4_4_1lkdlkdlc8axe0o.R.inc(28025);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28026);check(test, 1972, 6, 9); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict1244() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dugnmlmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict1244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dugnmlmj(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28027); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28028);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28029);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28030);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28031);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28032);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28033);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28034);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28035);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28036);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyAddWrapFieldToCopyDay1464() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137sy0ylmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay1464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137sy0ylmt(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28037); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28038);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28039);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28040);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28041);check(copy, 1972, 6, 30); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28042);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28043);check(copy, 1972, 6, 1); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28044);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28045);check(copy, 1972, 6, 27); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28046);test = new LocalDate(1972, 7, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28047);copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28048);check(copy, 1972, 7, 30); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28049);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28050);check(copy, 1972, 7, 31); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28051);copy = test.dayOfMonth().addWrapFieldToCopy(23); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28052);check(copy, 1972, 7, 1); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28053);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28054);check(copy, 1972, 7, 28); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyGetDay1484() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c71q4tlnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay1484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c71q4tlnb(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28055); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28056);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28057);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28058);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28059);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28060);assertSame(test, test.dayOfMonth().getLocalDate()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28061);assertEquals(9, test.dayOfMonth().get()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28062);assertEquals("9", test.dayOfMonth().getAsString()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28063);assertEquals("9", test.dayOfMonth().getAsText()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28064);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28065);assertEquals("9", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28066);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28067);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28068);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28069);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28070);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth1652() {__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceStart(getClass().getName(),28071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcu56clnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lkdlkdlc8axe0o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lkdlkdlc8axe0o.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth1652",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcu56clnr(){try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28071); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28072);LocalDate test = new LocalDate(1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28073);LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28074);check(test, 1972, 6, 9); 
     __CLR4_4_1lkdlkdlc8axe0o.R.inc(28075);check(copy, 1972, 6, 30); 
 }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1lkdlkdlc8axe0o.R.inc(28076);
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(28077);assertEquals(year, test.getYear());
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(28078);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1lkdlkdlc8axe0o.R.inc(28079);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1lkdlkdlc8axe0o.R.flushNeeded();}}
}
