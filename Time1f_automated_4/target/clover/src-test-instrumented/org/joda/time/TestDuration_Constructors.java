/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Constructors extends TestCase {static class __CLR4_4_1hpehpele6o79ps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1hpehpele6o79ps.R.inc(22946);
        __CLR4_4_1hpehpele6o79ps.R.inc(22947);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hpehpele6o79ps.R.inc(22948);
        __CLR4_4_1hpehpele6o79ps.R.inc(22949);return new TestSuite(TestDuration_Constructors.class);
    }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}

    public TestDuration_Constructors(String name) {
        super(name);__CLR4_4_1hpehpele6o79ps.R.inc(22951);try{__CLR4_4_1hpehpele6o79ps.R.inc(22950);
    }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hpehpele6o79ps.R.inc(22952);
        __CLR4_4_1hpehpele6o79ps.R.inc(22953);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hpehpele6o79ps.R.inc(22954);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hpehpele6o79ps.R.inc(22955);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hpehpele6o79ps.R.inc(22956);originalLocale = Locale.getDefault();
        __CLR4_4_1hpehpele6o79ps.R.inc(22957);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hpehpele6o79ps.R.inc(22958);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hpehpele6o79ps.R.inc(22959);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hpehpele6o79ps.R.inc(22960);
        __CLR4_4_1hpehpele6o79ps.R.inc(22961);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hpehpele6o79ps.R.inc(22962);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hpehpele6o79ps.R.inc(22963);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hpehpele6o79ps.R.inc(22964);Locale.setDefault(originalLocale);
        __CLR4_4_1hpehpele6o79ps.R.inc(22965);originalDateTimeZone = null;
        __CLR4_4_1hpehpele6o79ps.R.inc(22966);originalTimeZone = null;
        __CLR4_4_1hpehpele6o79ps.R.inc(22967);originalLocale = null;
    }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
public void testFactory_standardMinutes_long101() throws Throwable {__CLR4_4_1hpehpele6o79ps.R.globalSliceStart(getClass().getName(),22968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itzbpjhq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hpehpele6o79ps.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hpehpele6o79ps.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardMinutes_long101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itzbpjhq0() throws Throwable{try{__CLR4_4_1hpehpele6o79ps.R.inc(22968); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22969);Duration test = Duration.standardMinutes(1); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22970);assertEquals(60L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22971);test = Duration.standardMinutes(2); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22972);assertEquals(2L * 60L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22973);test = Duration.standardMinutes(0); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22974);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}
public void testFactory_standardMinutes_long102() throws Throwable {__CLR4_4_1hpehpele6o79ps.R.globalSliceStart(getClass().getName(),22975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkzcx2hq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hpehpele6o79ps.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hpehpele6o79ps.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardMinutes_long102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkzcx2hq7() throws Throwable{try{__CLR4_4_1hpehpele6o79ps.R.inc(22975); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22976);Duration test = Duration.standardMinutes(1); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22977);assertEquals(60L * 1000L, test.getMillis()); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22978);test = Duration.standardMinutes(2); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22979);assertEquals(2L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22980);test = Duration.standardMinutes(0); 
     __CLR4_4_1hpehpele6o79ps.R.inc(22981);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1hpehpele6o79ps.R.flushNeeded();}}
    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    

}
