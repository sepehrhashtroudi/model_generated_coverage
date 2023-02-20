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
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1n1in1ile6qsf6k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,30034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29862);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29863);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29864);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29865);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1n1in1ile6qsf6k.R.inc(29867);try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29866);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29868);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29869);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29870);zone = DateTimeZone.getDefault();
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29871);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29872);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29873);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29874);DateTimeZone.setDefault(zone);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(29875);zone = null;
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testCompareTo11() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7lrsln1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7lrsln1w(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29876); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29877);Partial test1 = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29878);Partial test1a = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29879);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29880);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29881);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29882);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29883);Partial test2 = createHourMinPartial2(ISO_UTC); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29884);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29885);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29886);Partial test3 = createHourMinPartial2(COPTIC_UTC); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29887);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29888);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29889);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29890);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC))); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29891);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29892);test1.compareTo(null); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29893);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29894);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29895);test1.compareTo(new YearMonthDay()); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29896);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29897);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29898);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay()); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29899);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testToString2620() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgq12fn2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgq12fn2k(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29900); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29901);Partial test = new Partial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29902);assertEquals("[]", test.toString()); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWith3f621() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dt3ovn2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dt3ovn2n(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29903); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29904);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29905);Partial result = test.with(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29906);assertEquals(2, result.size()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29907);assertEquals(1, result.get(DateTimeFieldType.era())); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29908);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29909);assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29910);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testGetFormatter1630() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfjuq7n2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfjuq7n2v(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29911); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29912);Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29913);assertEquals("2005", test.getFormatter().print(test)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29914);test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29915);assertEquals("2005-06", test.getFormatter().print(test)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29916);test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29917);assertEquals("2005-06-25", test.getFormatter().print(test)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29918);test = test.without(DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29919);assertEquals("2005--25", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithChronologyRetainFields_Chrono631() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viiqahn34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viiqahn34(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29920); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29921);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29922);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29923);check(base, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29924);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29925);check(test, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29926);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono632() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7ymu6n3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7ymu6n3b(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29927); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29928);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29929);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29930);assertSame(base, test); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWith2633() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltc1stn3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith2633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltc1stn3f(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29931); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29932);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29933);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29934);test.with(null, 6); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29935);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29936);check(test, 10, 20); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWith_argHasNoRange634() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3lzt9n3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3lzt9n3l(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29937); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29938);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29939);Partial result = test.with(DateTimeFieldType.year(), 10); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29940);assertEquals(2, result.size()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29941);assertEquals(0, result.indexOf(DateTimeFieldType.year())); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29942);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay())); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithField2635() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujfcmpn3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujfcmpn3r(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29943); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29944);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29945);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29946);test.withField(null, 6); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29947);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29948);check(test, 10, 20); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithField1636() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5411rn3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField1636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5411rn3x(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29949); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29950);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29951);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29952);check(test, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29953);check(result, 15, 20); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithField4637() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec24mpn42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec24mpn42(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29954); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29955);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29956);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29957);assertSame(test, result); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithFieldAdded1638() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp1rv3n46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded1638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp1rv3n46(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29958); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29959);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29960);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29961);assertEquals(createHourMinPartial(), test); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29962);check(test, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29963);check(result, 16, 20); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithFieldAdded4639() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ui3oa5n4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ui3oa5n4c(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29964); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29965);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29966);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29967);assertSame(test, result); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithFieldAddWrapped5640() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm5n56n4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm5n56n4g(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29968); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29969);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29970);try { 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29971);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1n1in1ile6qsf6k.R.inc(29972);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29973);check(test, 10, 20); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithFieldAddWrapped8641() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlwiewn4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlwiewn4m(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29974); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29975);Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29976);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29977);check(test, 0, 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29978);check(result, 23, 59); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29979);test = createHourMinPartial(0, 0, ISO_UTC); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29980);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29981);check(test, 0, 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29982);check(result, 23, 0); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testWithFieldAddWrapped4642() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9gxiln4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped4642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9gxiln4v(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29983); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29984);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29985);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29986);assertSame(test, result); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testMinus_RP643() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4fakdn4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP643",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4fakdn4z(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29987); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29988);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29989);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29990);check(test, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29991);check(result, 9, 19); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29992);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29993);assertSame(test, result); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testPlus_RP644() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),29994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd0vron56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd0vron56(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(29994); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29995);Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29996);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29997);check(test, 10, 20); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29998);check(result, 15, 26); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(29999);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30000);assertSame(test, result); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testToString5647() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),30001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ruqkmvn5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ruqkmvn5d(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30001); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30002);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30003);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30004);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30005);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testToString_String648() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),30006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14elmfjn5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String648",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14elmfjn5i(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30006); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30007);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30008);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30009);assertEquals("10:20", test.toString((String) null)); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testToString_String_Locale649() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),30010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of2ym3n5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale649",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of2ym3n5m(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30010); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30011);Partial test = createHourMinPartial(); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30012);assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30013);assertEquals("10:20", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30014);assertEquals("10 20", test.toString("H m", null)); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30015);assertEquals("10:20", test.toString(null, null)); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 


public void testToString41107() {__CLR4_4_1n1in1ile6qsf6k.R.globalSliceStart(getClass().getName(),30016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsdrqcn5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n1in1ile6qsf6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n1in1ile6qsf6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString41107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsdrqcn5s(){try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30016); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30017);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30018);assertEquals("-W-5", test.toString()); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30019);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1n1in1ile6qsf6k.R.inc(30020);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString()); 
 }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30021);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30022);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30023);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30024);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30025);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30026);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30027);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30028);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30029);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30030);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1n1in1ile6qsf6k.R.inc(30031);
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30032);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1n1in1ile6qsf6k.R.inc(30033);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1n1in1ile6qsf6k.R.flushNeeded();}}
}
