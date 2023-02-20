/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1hnohnole6np4dw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22948,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1hnohnole6np4dw.R.inc(22884);
        __CLR4_4_1hnohnole6np4dw.R.inc(22885);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hnohnole6np4dw.R.inc(22886);
        __CLR4_4_1hnohnole6np4dw.R.inc(22887);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1hnohnole6np4dw.R.inc(22889);try{__CLR4_4_1hnohnole6np4dw.R.inc(22888);
    }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hnohnole6np4dw.R.inc(22890);
        __CLR4_4_1hnohnole6np4dw.R.inc(22891);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hnohnole6np4dw.R.inc(22892);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hnohnole6np4dw.R.inc(22893);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hnohnole6np4dw.R.inc(22894);originalLocale = Locale.getDefault();
        __CLR4_4_1hnohnole6np4dw.R.inc(22895);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hnohnole6np4dw.R.inc(22896);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hnohnole6np4dw.R.inc(22897);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hnohnole6np4dw.R.inc(22898);
        __CLR4_4_1hnohnole6np4dw.R.inc(22899);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hnohnole6np4dw.R.inc(22900);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hnohnole6np4dw.R.inc(22901);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hnohnole6np4dw.R.inc(22902);Locale.setDefault(originalLocale);
        __CLR4_4_1hnohnole6np4dw.R.inc(22903);originalDateTimeZone = null;
        __CLR4_4_1hnohnole6np4dw.R.inc(22904);originalTimeZone = null;
        __CLR4_4_1hnohnole6np4dw.R.inc(22905);originalLocale = null;
    }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testMinus_RD387() {__CLR4_4_1hnohnole6np4dw.R.globalSliceStart(getClass().getName(),22906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j53206hoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnohnole6np4dw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnohnole6np4dw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j53206hoa(){try{__CLR4_4_1hnohnole6np4dw.R.inc(22906); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22907);Duration test = new Duration(123L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22908);Duration result = test.minus(null); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22909);assertSame(test, result); 
 }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
public void testDividedBy_long188() {__CLR4_4_1hnohnole6np4dw.R.globalSliceStart(getClass().getName(),22910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oytmr7hoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnohnole6np4dw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnohnole6np4dw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oytmr7hoe(){try{__CLR4_4_1hnohnole6np4dw.R.inc(22910); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22911);Duration test = new Duration(246L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22912);Duration result = test.dividedBy(2L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22913);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
public void testToPeriodFrom273() {__CLR4_4_1hnohnole6np4dw.R.globalSliceStart(getClass().getName(),22914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkzw59hoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnohnole6np4dw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnohnole6np4dw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkzw59hoi(){try{__CLR4_4_1hnohnole6np4dw.R.inc(22914); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22915);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1hnohnole6np4dw.R.inc(22916);Duration test = new Duration(length); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22917);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22918);Period result = test.toPeriodFrom(dt); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22919);assertEquals(new Period(dt, test), result); 
 }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
public void testEqualsHashCode598() {__CLR4_4_1hnohnole6np4dw.R.globalSliceStart(getClass().getName(),22920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gizf73hoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnohnole6np4dw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnohnole6np4dw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gizf73hoo(){try{__CLR4_4_1hnohnole6np4dw.R.inc(22920); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22921);Duration test1 = new Duration(123L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22922);Duration test2 = new Duration(123L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22923);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22924);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22925);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22926);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22927);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22928);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22929);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22930);Duration test3 = new Duration(321L); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22931);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22932);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22933);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22934);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22935);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22936);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22937);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1hnohnole6np4dw.R.inc(22938);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1hnohnole6np4dw.R.inc(22940);try{__CLR4_4_1hnohnole6np4dw.R.inc(22939);
            __CLR4_4_1hnohnole6np4dw.R.inc(22941);iValue = value;
        }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hnohnole6np4dw.R.inc(22942);
            __CLR4_4_1hnohnole6np4dw.R.inc(22943);return iValue;
        }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
    }

    

    
    
    
    
    
    
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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1hnohnole6np4dw.R.inc(22945);try{__CLR4_4_1hnohnole6np4dw.R.inc(22944);
        }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1hnohnole6np4dw.R.inc(22946);
            __CLR4_4_1hnohnole6np4dw.R.inc(22947);super.setMillis(duration);
        }finally{__CLR4_4_1hnohnole6np4dw.R.flushNeeded();}}
    }

}
