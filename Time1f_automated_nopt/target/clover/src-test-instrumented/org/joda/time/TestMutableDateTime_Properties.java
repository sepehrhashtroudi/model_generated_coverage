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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1hnnhnnldl911a5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,22927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1hnnhnnldl911a5.R.inc(22883);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22884);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hnnhnnldl911a5.R.inc(22885);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22886);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1hnnhnnldl911a5.R.inc(22888);try{__CLR4_4_1hnnhnnldl911a5.R.inc(22887);
    }finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hnnhnnldl911a5.R.inc(22889);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22890);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22891);zone = DateTimeZone.getDefault();
        __CLR4_4_1hnnhnnldl911a5.R.inc(22892);locale = Locale.getDefault();
        __CLR4_4_1hnnhnnldl911a5.R.inc(22893);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22894);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hnnhnnldl911a5.R.inc(22895);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22896);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hnnhnnldl911a5.R.inc(22897);DateTimeZone.setDefault(zone);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22898);Locale.setDefault(locale);
        __CLR4_4_1hnnhnnldl911a5.R.inc(22899);zone = null;
    }finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPreviousTransition33() throws Exception {__CLR4_4_1hnnhnnldl911a5.R.globalSliceStart(getClass().getName(),22900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrtwzpho4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnnhnnldl911a5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnnhnnldl911a5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPreviousTransition33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrtwzpho4() throws Exception{try{__CLR4_4_1hnnhnnldl911a5.R.inc(22900); __CLR4_4_1hnnhnnldl911a5.R.inc(22901);DateTime dt = DateTime.now(); __CLR4_4_1hnnhnnldl911a5.R.inc(22902);DateTime dt1 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1hnnhnnldl911a5.R.inc(22903);DateTime dt2 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1hnnhnnldl911a5.R.inc(22904);DateTime dt3 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1hnnhnnldl911a5.R.inc(22905);DateTime dt4 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1hnnhnnldl911a5.R.inc(22906);DateTime dt5 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
}finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

public void testAdd1266() {__CLR4_4_1hnnhnnldl911a5.R.globalSliceStart(getClass().getName(),22907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wl07ophob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnnhnnldl911a5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnnhnnldl911a5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testAdd1266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wl07ophob(){try{__CLR4_4_1hnnhnnldl911a5.R.inc(22907); __CLR4_4_1hnnhnnldl911a5.R.inc(22908);final DateTime dt = new DateTime(2001, 1, 1, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22909);DateTime dt2 = new DateTime(2001, 1, 2, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22910);DateTime dt3 = new DateTime(2001, 1, 3, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22911);DateTime dt4 = new DateTime(2001, 1, 4, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22912);DateTime dt5 = new DateTime(2001, 1, 5, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22913);DateTime dt6 = new DateTime(2001, 1, 6, 0, 0, 0); __CLR4_4_1hnnhnnldl911a5.R.inc(22914);DateTime dt7 = new DateTime(2001, 1, 7, 0, 0, 0);
}finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

public void testBaseDateTime1271() {__CLR4_4_1hnnhnnldl911a5.R.globalSliceStart(getClass().getName(),22915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2dlnkhoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnnhnnldl911a5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnnhnnldl911a5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testBaseDateTime1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2dlnkhoj(){try{__CLR4_4_1hnnhnnldl911a5.R.inc(22915); __CLR4_4_1hnnhnnldl911a5.R.inc(22916);DateTime dt = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22917);DateTime dt2 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22918);DateTime dt3 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22919);DateTime dt4 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22920);DateTime dt5 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22921);DateTime dt6 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22922);DateTime dt7 = new DateTime(DateTimeZone.UTC); __CLR4_4_1hnnhnnldl911a5.R.inc(22923);assertEquals(dt.getMillis(), dt2.getMillis()); __CLR4_4_1hnnhnnldl911a5.R.inc(22924);assertEquals(dt.getMillis(), dt3.getMillis()); __CLR4_4_1hnnhnnldl911a5.R.inc(22925);assertEquals(dt.getMillis(), dt4.getMillis()); __CLR4_4_1hnnhnnldl911a5.R.inc(22926);assertEquals(dt.getMillis(), dt5.getMillis());
}finally{__CLR4_4_1hnnhnnldl911a5.R.flushNeeded();}}

    

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
    

    

    

    

    

    

    

    

    

}
