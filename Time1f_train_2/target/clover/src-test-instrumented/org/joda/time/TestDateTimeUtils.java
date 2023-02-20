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

import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1hp1hp1le6qsep7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,23081,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22933);
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22934);String str = System.getProperty("java.version");
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22935);boolean old = true;
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22936);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hp1hp1le6qsep7.R.iget(22937)!=0|true))||(__CLR4_4_1hp1hp1le6qsep7.R.iget(22938)==0&false))) {{
            __CLR4_4_1hp1hp1le6qsep7.R.inc(22939);old = false;
        }
        }__CLR4_4_1hp1hp1le6qsep7.R.inc(22940);OLD_JDK = old;
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
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
        
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22941);
        // don't call Policy.getPolicy()
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22942);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22943);
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22944);Permissions p = new Permissions();
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22945);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22946);return p;
            }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22947);
            }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22948);
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22949);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hp1hp1le6qsep7.R.iget(22950)!=0|true))||(__CLR4_4_1hp1hp1le6qsep7.R.iget(22951)==0&false))) {{
                    __CLR4_4_1hp1hp1le6qsep7.R.inc(22952);return false;
                }
                }__CLR4_4_1hp1hp1le6qsep7.R.inc(22953);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
        };
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22954);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22955);
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22956);Permissions p = new Permissions();
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22957);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hp1hp1le6qsep7.R.inc(22958);return p;
            }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22959);
            }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22960);
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22961);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22962);
        __CLR4_4_1hp1hp1le6qsep7.R.inc(22963);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1hp1hp1le6qsep7.R.inc(22965);try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22964);
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22966);
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22967);
    }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP_GJChronology117() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),22968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbd2yrhq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbd2yrhq0(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22968); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22969);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22970);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22971);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22972);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22973);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22974);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22975);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22976);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22977);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22978);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22979);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22980);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22981);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22982);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22983);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(22984);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(22985);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testGetIntervalChronology_RInterval548() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),22986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utq7qfhqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utq7qfhqi(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22986); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22987);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22988);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22989);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22990);MutableInterval ai = new MutableInterval() { 
  
         private static final long serialVersionUID = 1L; 
  
         public Chronology getChronology() {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22991); 
             __CLR4_4_1hp1hp1le6qsep7.R.inc(22992);return null; 
         }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22993);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai)); 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testClass769() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),22994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4kim3hqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass769",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4kim3hqq(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(22994); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22995);Class<?> cls = DateTimeUtils.class; 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22996);assertEquals(true, Modifier.isPublic(cls.getModifiers())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22997);assertEquals(false, Modifier.isFinal(cls.getModifiers())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22998);assertEquals(1, cls.getDeclaredConstructors().length); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(22999);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23000);new DateTimeUtils() { 
     }; 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testOffsetMillis770() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qfxykhqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis770",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qfxykhqx(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23001); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23002);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23003);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23004);long nowSystem = System.currentTimeMillis(); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23005);long now = DateTimeUtils.currentTimeMillis(); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23006);long nowAdjustDay = now + (24 * 60 * 60 * 1000); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23007);assertTrue((now < nowSystem)); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23008);assertTrue((nowAdjustDay >= nowSystem)); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23009);assertTrue((nowAdjustDay - nowSystem) < 10000L); 
     } finally { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23010);DateTimeUtils.setCurrentMillisSystem(); 
     } 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23011);long nowSystem = System.currentTimeMillis(); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23012);long now = DateTimeUtils.currentTimeMillis(); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23013);assertTrue((now >= nowSystem)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23014);assertTrue((now - nowSystem) < 10000L); 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testGetInstantMillis_RI771() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168dojphrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI771",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168dojphrb(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23015); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23016);Instant i = new Instant(123L); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23017);assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23018);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23019);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23020);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null)); 
     } finally { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23021);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testMillisProvider_null772() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15s450chri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null772",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15s450chri(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23022); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23023);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23024);DateTimeUtils.setCurrentMillisProvider(null); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testMillisProvider773() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3ym6nhrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider773",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3ym6nhrl(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23025); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23026);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23027);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() { 
  
             public long getMillis() {try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23028); 
                 __CLR4_4_1hp1hp1le6qsep7.R.inc(23029);return 1L; 
             }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 
         }); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23030);assertEquals(1L, DateTimeUtils.currentTimeMillis()); 
     } finally { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23031);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testGetIntervalChronology_RI_RI774() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vawvfehrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI774",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vawvfehrs(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23032); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23033);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23034);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23035);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23036);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23037);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23038);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testGetReadableInterval_ReadableInterval775() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140egddhrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval775",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140egddhrz(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23039); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23040);ReadableInterval input = new Interval(0, 100L); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23041);assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23042);try { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23043);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23044);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         __CLR4_4_1hp1hp1le6qsep7.R.inc(23045);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void testGetZone_Zone776() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lao736hs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone776",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lao736hs6(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23046); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23047);assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23048);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 


public void test_julianDay777() {__CLR4_4_1hp1hp1le6qsep7.R.globalSliceStart(getClass().getName(),23049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9glqchs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hp1hp1le6qsep7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hp1hp1le6qsep7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay777",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9glqchs9(){try{__CLR4_4_1hp1hp1le6qsep7.R.inc(23049); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23050);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23051);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23052);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23053);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23054);base = base.plusHours(6); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23055);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23056);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23057);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23058);base = base.plusHours(6); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23059);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23060);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23061);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23062);base = base.plusHours(6); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23063);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23064);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23065);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23066);base = base.plusHours(6); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23067);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23068);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23069);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23070);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23071);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23072);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23073);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23074);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23075);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23076);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23077);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23078);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23079);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hp1hp1le6qsep7.R.inc(23080);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 }finally{__CLR4_4_1hp1hp1le6qsep7.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void testOffsetMillisToZero() {
//         long now1 = 0L;
//         try {
//             // set time to one day ago
//             DateTimeUtils.setCurrentMillisOffset(0);
//             now1 = DateTimeUtils.currentTimeMillis();
//         } finally {
//             DateTimeUtils.setCurrentMillisSystem();
//         }
//         long now2 = DateTimeUtils.currentTimeMillis();
//         assertEquals(now1, now2);
//     }

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
