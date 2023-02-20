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
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1j8kj8kle6o79z2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24932);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24933);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24934);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24935);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1j8kj8kle6o79z2.R.inc(24937);try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24936);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24938);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24939);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24940);zone = DateTimeZone.getDefault();
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24941);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24942);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24943);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24944);DateTimeZone.setDefault(zone);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24945);zone = null;
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetFormatter1249() {__CLR4_4_1j8kj8kle6o79z2.R.globalSliceStart(getClass().getName(),24946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wp5v7j8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8kj8kle6o79z2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8kj8kle6o79z2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wp5v7j8y(){try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24946); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24947);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24948);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24949);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24950);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24951);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24952);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24953);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24954);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
public void testWithField2257() {__CLR4_4_1j8kj8kle6o79z2.R.globalSliceStart(getClass().getName(),24955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3ewhhj97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8kj8kle6o79z2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8kj8kle6o79z2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3ewhhj97(){try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24955); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24956);Partial test = createHourMinPartial(); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24957);try { 
         __CLR4_4_1j8kj8kle6o79z2.R.inc(24958);test.withField(null, 6); 
         __CLR4_4_1j8kj8kle6o79z2.R.inc(24959);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
public void testWithField2258() {__CLR4_4_1j8kj8kle6o79z2.R.globalSliceStart(getClass().getName(),24960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuexp0j9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8kj8kle6o79z2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8kj8kle6o79z2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuexp0j9c(){try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24960); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24961);Partial test = createHourMinPartial(); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24962);try { 
         __CLR4_4_1j8kj8kle6o79z2.R.inc(24963);test.withField(null, 6); 
         __CLR4_4_1j8kj8kle6o79z2.R.inc(24964);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24965);check(test, 10, 20); 
 }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
public void testWithFieldAddWrapped8259() {__CLR4_4_1j8kj8kle6o79z2.R.globalSliceStart(getClass().getName(),24966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udr62dj9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8kj8kle6o79z2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8kj8kle6o79z2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udr62dj9i(){try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24966); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24967);Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24968);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24969);check(test, 0, 0); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24970);check(result, 23, 59); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24971);test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24972);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24973);check(test, 0, 0); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24974);check(result, 23, 0); 
 }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
public void testPropertyGetEra286() {__CLR4_4_1j8kj8kle6o79z2.R.globalSliceStart(getClass().getName(),24975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15w72luj9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8kj8kle6o79z2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8kj8kle6o79z2.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPropertyGetEra286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15w72luj9r(){try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24975); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24976);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24977);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24978);assertEquals("era", test.era().getName()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24979);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24980);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24981);assertEquals(1, test.era().get()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24982);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24983);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24984);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24985);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24986);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24987);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24988);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24989);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24990);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24991);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24992);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24993);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24994);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24995);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1j8kj8kle6o79z2.R.inc(24996);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24997);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(24998);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(24999);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25000);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(25001);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25002);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(25003);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25004);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(25005);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25006);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1j8kj8kle6o79z2.R.inc(25007);
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25008);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1j8kj8kle6o79z2.R.inc(25009);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1j8kj8kle6o79z2.R.flushNeeded();}}
}
