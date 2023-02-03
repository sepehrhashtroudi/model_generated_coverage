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
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * This class is a Junit unit test for serialization.
 *
 * @author Stephen Colebourne
 */
public class TestSerialization extends TestCase {static class __CLR4_4_1pgapgalc8axehs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    
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

//    private static class MockDelegatedDurationField extends DelegatedDurationField implements Serializable {
//        private static final long serialVersionUID = 1878496002811998493L;        
//        public MockDelegatedDurationField() {
//            super(MillisDurationField.INSTANCE);
//        }
//    }

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1pgapgalc8axehs.R.inc(32986);
        __CLR4_4_1pgapgalc8axehs.R.inc(32987);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pgapgalc8axehs.R.inc(32988);
        __CLR4_4_1pgapgalc8axehs.R.inc(32989);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1pgapgalc8axehs.R.inc(32991);try{__CLR4_4_1pgapgalc8axehs.R.inc(32990);
    }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pgapgalc8axehs.R.inc(32992);
        __CLR4_4_1pgapgalc8axehs.R.inc(32993);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pgapgalc8axehs.R.inc(32994);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pgapgalc8axehs.R.inc(32995);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pgapgalc8axehs.R.inc(32996);originalLocale = Locale.getDefault();
        __CLR4_4_1pgapgalc8axehs.R.inc(32997);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pgapgalc8axehs.R.inc(32998);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pgapgalc8axehs.R.inc(32999);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pgapgalc8axehs.R.inc(33000);
        __CLR4_4_1pgapgalc8axehs.R.inc(33001);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pgapgalc8axehs.R.inc(33002);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pgapgalc8axehs.R.inc(33003);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pgapgalc8axehs.R.inc(33004);Locale.setDefault(originalLocale);
        __CLR4_4_1pgapgalc8axehs.R.inc(33005);originalDateTimeZone = null;
        __CLR4_4_1pgapgalc8axehs.R.inc(33006);originalTimeZone = null;
        __CLR4_4_1pgapgalc8axehs.R.inc(33007);originalLocale = null;
    }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1pgapgalc8axehs.R.inc(33008);
        __CLR4_4_1pgapgalc8axehs.R.inc(33009);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1pgapgalc8axehs.R.inc(33010);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1pgapgalc8axehs.R.inc(33011);oos.writeObject(test);
        __CLR4_4_1pgapgalc8axehs.R.inc(33012);oos.close();

        __CLR4_4_1pgapgalc8axehs.R.inc(33013);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1pgapgalc8axehs.R.inc(33014);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1pgapgalc8axehs.R.inc(33015);Object obj = ois.readObject();
        __CLR4_4_1pgapgalc8axehs.R.inc(33016);ois.close();

        __CLR4_4_1pgapgalc8axehs.R.inc(33017);if ((((same)&&(__CLR4_4_1pgapgalc8axehs.R.iget(33018)!=0|true))||(__CLR4_4_1pgapgalc8axehs.R.iget(33019)==0&false))) {{
            __CLR4_4_1pgapgalc8axehs.R.inc(33020);assertSame(test, obj);
        } }else {{
            __CLR4_4_1pgapgalc8axehs.R.inc(33021);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}
public void testSerializedGJChronology55() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9v49kpha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronology55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9v49kpha() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33022); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33023);GJChronology test = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33024);loadAndCompare(test, "GJChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33025);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedISOChronology113() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1c9f1phe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedISOChronology113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1c9f1phe() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33026); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33027);ISOChronology test = ISOChronology.getInstance(PARIS); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33028);loadAndCompare(test, "ISOChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33029);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedGregorianChronology125() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeryurphi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGregorianChronology125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeryurphi() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33030); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33031);GregorianChronology test = GregorianChronology.getInstance(PARIS); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33032);loadAndCompare(test, "GregorianChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33033);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedBuddhistChronology202() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f17k5kphm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedBuddhistChronology202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f17k5kphm() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33034); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33035);BuddhistChronology test = BuddhistChronology.getInstance(PARIS); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33036);loadAndCompare(test, "BuddhistChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33037);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedLocalDateBuddhist278() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le7pbyphq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le7pbyphq() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33038); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33039);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC()); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33040);loadAndCompare(test, "LocalDateBuddhist", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33041);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedDateTimeProperty384() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ai8ogphu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeProperty384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ai8ogphu() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33042); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33043);DateTime.Property test = new DateTime().hourOfDay(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33044);loadAndCompare(test, "DateTimeProperty", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33045);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedJulianChronology460() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ph0yxaphy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedJulianChronology460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ph0yxaphy() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33046); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33047);JulianChronology test = JulianChronology.getInstance(PARIS); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33048);loadAndCompare(test, "JulianChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33049);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedCopticChronology546() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqv9q2pi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqv9q2pi2() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33050); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33051);CopticChronology test = CopticChronology.getInstance(LONDON); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33052);loadAndCompare(test, "CopticChronology", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33053);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedMutableDateTimeProperty681() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yfk8api6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty681",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yfk8api6() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33054); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33055);MutableDateTime.Property test = new MutableDateTime().hourOfDay(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33056);loadAndCompare(test, "MutableDateTimeProperty", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33057);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testSerializedDateMidnightProperty752() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14786q6pia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty752",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14786q6pia() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33058); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33059);DateMidnight.Property test = new DateMidnight().monthOfYear(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33060);loadAndCompare(test, "DateMidnightProperty", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33061);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testSerializedYearMonthDay939() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6f46hpie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay939",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6f46hpie() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33062); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33063);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33064);loadAndCompare(test, "YearMonthDay", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33065);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedLocalDateTime1055() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18c4mupii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateTime1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18c4mupii() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33066); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33067);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33068);loadAndCompare(test, "LocalDateTime", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33069);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedUnsupportedDateTimeField1119() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19upbxtpim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField1119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19upbxtpim() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33070); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33071);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), UnsupportedDurationField.getInstance(DurationFieldType.years())); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33072);loadAndCompare(test, "UnsupportedDateTimeField", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33073);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedDateTimeFieldType1134() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5xd4bpiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeFieldType1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5xd4bpiq() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33074); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33075);DateTimeFieldType test = DateTimeFieldType.clockhourOfDay(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33076);loadAndCompare(test, "DateTimeFieldType", true); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33077);inlineCompare(test, true); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testDuration1363() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jqgmspiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration1363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jqgmspiu() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33078); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33079);Duration test = Duration.millis(12345); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33080);loadAndCompare(test, "Duration", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33081);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedPeriodType1673() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17576ivpiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedPeriodType1673",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17576ivpiy() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33082); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33083);PeriodType test = PeriodType.dayTime(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33084);loadAndCompare(test, "PeriodType", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33085);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 


public void testSerializedLocalTime1749() throws Exception {__CLR4_4_1pgapgalc8axehs.R.globalSliceStart(getClass().getName(),33086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hkvx0pj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pgapgalc8axehs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pgapgalc8axehs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalTime1749",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hkvx0pj2() throws Exception{try{__CLR4_4_1pgapgalc8axehs.R.inc(33086); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33087);LocalTime test = new LocalTime(); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33088);loadAndCompare(test, "LocalTime", false); 
     __CLR4_4_1pgapgalc8axehs.R.inc(33089);inlineCompare(test, false); 
 }finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1pgapgalc8axehs.R.inc(33090);
        __CLR4_4_1pgapgalc8axehs.R.inc(33091);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1pgapgalc8axehs.R.inc(33092);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1pgapgalc8axehs.R.inc(33093);Object obj = ois.readObject();
        __CLR4_4_1pgapgalc8axehs.R.inc(33094);ois.close();
        __CLR4_4_1pgapgalc8axehs.R.inc(33095);if ((((same)&&(__CLR4_4_1pgapgalc8axehs.R.iget(33096)!=0|true))||(__CLR4_4_1pgapgalc8axehs.R.iget(33097)==0&false))) {{
            __CLR4_4_1pgapgalc8axehs.R.inc(33098);assertSame(test, obj);
        } }else {{
            __CLR4_4_1pgapgalc8axehs.R.inc(33099);assertEquals(test, obj);
        }
//        try {
//            fis = new FileInputStream("src/test/resources/" + filename + "2.dat");
//            ois = new ObjectInputStream(fis);
//            obj = ois.readObject();
//            ois.close();
//            if (same) {
//                assertSame(test, obj);
//            } else {
//                assertEquals(test, obj);
//            }
//        } catch (FileNotFoundException ex) {
//            // ignore
//        }
    }}finally{__CLR4_4_1pgapgalc8axehs.R.flushNeeded();}}

    

//    //-----------------------------------------------------------------------
//    public void testStoreSerializedInstant() throws Exception {
//        Instant test = new Instant();
//        store(test, "Instant.dat");
//    }
//
//    public void testStoreSerializedDateTime() throws Exception {
//        DateTime test = new DateTime();
//        store(test, "DateTime.dat");
//    }
//
//    public void testStoreSerializedMutableDateTime() throws Exception {
//        MutableDateTime test = new MutableDateTime();
//        store(test, "MutableDateTime.dat");
//    }
//
//    public void testStoreSerializedDateMidnight() throws Exception {
//        DateMidnight test = new DateMidnight();
//        store(test, "DateMidnight.dat");
//    }
//
//    public void testStoreSerializedLocalDate() throws Exception {
//        LocalDate test = new LocalDate();
//        store(test, "LocalDate.dat");
//    }
//
//    public void testStoreSerializedLocalDateBuddhist() throws Exception {
//        LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
//        store(test, "LocalDateBuddhist.dat");
//    }
//
//    public void testStoreSerializedLocalTime() throws Exception {
//        LocalTime test = new LocalTime();
//        store(test, "LocalTime.dat");
//    }
//
//    public void testStoreSerializedLocalDateTime() throws Exception {
//        LocalDateTime test = new LocalDateTime();
//        store(test, "LocalDateTime.dat");
//    }
//
//    public void testStoreSerializedYearMonthDay() throws Exception {
//        YearMonthDay test = new YearMonthDay();
//        store(test, "YearMonthDay.dat");
//    }
//
//    public void testStoreSerializedYearMonthDayProperty() throws Exception {
//        YearMonthDay.Property test = new YearMonthDay().monthOfYear();
//        store(test, "YearMonthDayProperty.dat");
//    }
//
//    public void testStoreSerializedTimeOfDay() throws Exception {
//        TimeOfDay test = new TimeOfDay();
//        store(test, "TimeOfDay.dat");
//    }
//
//    public void testStoreSerializedTimeOfDayProperty() throws Exception {
//        TimeOfDay.Property test = new TimeOfDay().hourOfDay();
//        store(test, "TimeOfDayProperty.dat");
//    }
//
//    public void testStoreSerializedDateTimeZoneUTC() throws Exception {
//        DateTimeZone test = DateTimeZone.UTC;
//        store(test, "DateTimeZoneUTC.dat");
//    }
//
//    public void testStoreSerializedDateTimeZone() throws Exception {
//        DateTimeZone test = PARIS;
//        store(test, "DateTimeZone.dat");
//    }
//
//    public void testStoreSerializedCopticChronology() throws Exception {
//        CopticChronology test = CopticChronology.getInstance(LONDON);
//        store(test, "CopticChronology.dat");
//    }
//
//    public void testStoreSerializedISOChronology() throws Exception {
//        ISOChronology test = ISOChronology.getInstance(PARIS);
//        store(test, "ISOChronology.dat");
//    }
//
//    public void testStoreSerializedGJChronology() throws Exception {
//        GJChronology test = GJChronology.getInstance(TOKYO);
//        store(test, "GJChronology.dat");
//    }
//
//    // Format changed in v1.2 - min days in first week not deserialized in v1.0/1.1
//    public void testStoreSerializedGJChronologyChangedInternals() throws Exception {
//        GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
//        store(test, "GJChronologyChangedInternals.dat");
//    }
//
//    public void testStoreSerializedGregorianChronology() throws Exception {
//        GregorianChronology test = GregorianChronology.getInstance(PARIS);
//        store(test, "GregorianChronology.dat");
//    }
//
//    public void testStoreSerializedJulianChronology() throws Exception {
//        JulianChronology test = JulianChronology.getInstance(PARIS);
//        store(test, "JulianChronology.dat");
//    }
//
//    public void testStoreSerializedBuddhistChronology() throws Exception {
//        BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
//        store(test, "BuddhistChronology.dat");
//    }
//
//    public void testStoreSerializedPeriodType() throws Exception {
//        PeriodType test = PeriodType.dayTime();
//        store(test, "PeriodType.dat");
//    }
//
//    public void testStoreSerializedDateTimeFieldType() throws Exception {
//        DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
//        store(test, "DateTimeFieldType.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDateTimeField() throws Exception {
//        UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
//                DateTimeFieldType.year(),
//                UnsupportedDurationField.getInstance(DurationFieldType.years()));
//        store(test, "UnsupportedDateTimeField.dat");
//    }
//
//    public void testStoreSerializedDurationFieldType() throws Exception {
//        DurationFieldType test = DurationFieldType.MINUTES_TYPE;
//        store(test, "DurationFieldType.dat");
//    }
//
//    public void testStoreSerializedMillisDurationField() throws Exception {
//        MillisDurationField test = (MillisDurationField) MillisDurationField.INSTANCE;
//        store(test, "MillisDurationField.dat");
//    }
//
//    public void testStoreSerializedDelegatedDurationField() throws Exception {
//        DelegatedDurationField test = new MockDelegatedDurationField();
//        store(test, "DelegatedDurationField.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDurationField() throws Exception {
//        UnsupportedDurationField test = UnsupportedDurationField.getInstance(DurationFieldType.eras());
//        store(test, "UnsupportedDurationField.dat");
//    }
//
    // format changed (properly defined) in v1.1
//    public void testStoreSerializedDateTimeProperty() throws Exception {
//        DateTime.Property test = new DateTime().hourOfDay();
//        store(test, "DateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedMutableDateTimeProperty() throws Exception {
//        MutableDateTime.Property test = new MutableDateTime().hourOfDay();
//        store(test, "MutableDateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        DateMidnight.Property test = new DateMidnight().monthOfYear();
//        store(test, "DateMidnightProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        Duration test = Duration.millis(12345);
//        store(test, "Duration.dat");
//    }

//    private void store(Serializable test, String filename) throws Exception {
//        FileOutputStream fos = new FileOutputStream("src/test/resources/" + filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(test);
//        } finally {
//            oos.close();
//        }
//        oos.close();
//    }

}
