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
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1hnbhnble6qe98z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,23024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22871);
        __CLR4_4_1hnbhnble6qe98z.R.inc(22872);String str = System.getProperty("java.version");
        __CLR4_4_1hnbhnble6qe98z.R.inc(22873);boolean old = true;
        __CLR4_4_1hnbhnble6qe98z.R.inc(22874);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hnbhnble6qe98z.R.iget(22875)!=0|true))||(__CLR4_4_1hnbhnble6qe98z.R.iget(22876)==0&false))) {{
            __CLR4_4_1hnbhnble6qe98z.R.inc(22877);old = false;
        }
        }__CLR4_4_1hnbhnble6qe98z.R.inc(22878);OLD_JDK = old;
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

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
    static {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22879);
        // don't call Policy.getPolicy()
        __CLR4_4_1hnbhnble6qe98z.R.inc(22880);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22881);
                __CLR4_4_1hnbhnble6qe98z.R.inc(22882);Permissions p = new Permissions();
                __CLR4_4_1hnbhnble6qe98z.R.inc(22883);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hnbhnble6qe98z.R.inc(22884);return p;
            }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22885);
            }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22886);
                __CLR4_4_1hnbhnble6qe98z.R.inc(22887);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hnbhnble6qe98z.R.iget(22888)!=0|true))||(__CLR4_4_1hnbhnble6qe98z.R.iget(22889)==0&false))) {{
                    __CLR4_4_1hnbhnble6qe98z.R.inc(22890);return false;
                }
                }__CLR4_4_1hnbhnble6qe98z.R.inc(22891);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
        };
        __CLR4_4_1hnbhnble6qe98z.R.inc(22892);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22893);
                __CLR4_4_1hnbhnble6qe98z.R.inc(22894);Permissions p = new Permissions();
                __CLR4_4_1hnbhnble6qe98z.R.inc(22895);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hnbhnble6qe98z.R.inc(22896);return p;
            }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22897);
            }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22898);
        __CLR4_4_1hnbhnble6qe98z.R.inc(22899);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22900);
        __CLR4_4_1hnbhnble6qe98z.R.inc(22901);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1hnbhnble6qe98z.R.inc(22903);try{__CLR4_4_1hnbhnble6qe98z.R.inc(22902);
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22904);
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22905);
    }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP8() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5ifdyhoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5ifdyhoa(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22906); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22907);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22908);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22909);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22910);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22911);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22912);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22913);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22914);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22915);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22916);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22917);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22918);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22919);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22920);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22921);try { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22922);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22923);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetIntervalChronology_RInterval569() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mhbxmuhos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mhbxmuhos(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22924); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22925);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22926);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22927);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22928);MutableInterval ai = new MutableInterval() { 
  
         private static final long serialVersionUID = 1L; 
  
         public Chronology getChronology() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22929); 
             __CLR4_4_1hnbhnble6qe98z.R.inc(22930);return null; 
         }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22931);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testOffsetMillis781() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybt8okhp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybt8okhp0(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22932); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22933);try { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22934);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22935);long nowSystem = System.currentTimeMillis(); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22936);long now = DateTimeUtils.currentTimeMillis(); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22937);long nowAdjustDay = now + (24 * 60 * 60 * 1000); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22938);assertTrue((now < nowSystem)); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22939);assertTrue((nowAdjustDay >= nowSystem)); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22940);assertTrue((nowAdjustDay - nowSystem) < 10000L); 
     } finally { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22941);DateTimeUtils.setCurrentMillisSystem(); 
     } 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22942);long nowSystem = System.currentTimeMillis(); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22943);long now = DateTimeUtils.currentTimeMillis(); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22944);assertTrue((now >= nowSystem)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22945);assertTrue((now - nowSystem) < 10000L); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetInstantMillis_RI782() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtvi3fhpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI782",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtvi3fhpe(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22946); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22947);Instant i = new Instant(123L); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22948);assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22949);try { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22950);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22951);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null)); 
     } finally { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22952);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testMillisProvider_null783() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wa51mshpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null783",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wa51mshpl(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22953); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22954);try { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22955);DateTimeUtils.setCurrentMillisProvider(null); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetInstantChronology_RI784() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d59l15hpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI784",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d59l15hpo(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22956); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22957);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22958);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22959);Instant i = new Instant(123L); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22960);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22961);AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22962); 
             __CLR4_4_1hnbhnble6qe98z.R.inc(22963);return 0L; 
         }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 
  
         public Chronology getChronology() {try{__CLR4_4_1hnbhnble6qe98z.R.inc(22964); 
             __CLR4_4_1hnbhnble6qe98z.R.inc(22965);return null; 
         }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22966);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22967);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetIntervalChronology_RI_RI785() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rcb7qhq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rcb7qhq0(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22968); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22969);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22970);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22971);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22972);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22973);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22974);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetReadableInterval_ReadableInterval786() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1uq9rhq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval786",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1uq9rhq7(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22975); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22976);ReadableInterval input = new Interval(0, 100L); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22977);assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22978);try { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22979);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22980);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         __CLR4_4_1hnbhnble6qe98z.R.inc(22981);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetZone_Zone787() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grkzjyhqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone787",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grkzjyhqe(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22982); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22983);assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22984);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetPeriodType_PeriodType788() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zg0hphqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType788",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zg0hphqh(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22985); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22986);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22987);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void testGetDurationMillis_RI789() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmpt7rhqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmpt7rhqk(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22988); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22989);Duration dur = new Duration(123L); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22990);assertEquals(123L, DateTimeUtils.getDurationMillis(dur)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22991);assertEquals(0L, DateTimeUtils.getDurationMillis(null)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 


public void test_julianDay791() {__CLR4_4_1hnbhnble6qe98z.R.globalSliceStart(getClass().getName(),22992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htxfwkhqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnbhnble6qe98z.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnbhnble6qe98z.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay791",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htxfwkhqo(){try{__CLR4_4_1hnbhnble6qe98z.R.inc(22992); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22993);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22994);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22995);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22996);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22997);base = base.plusHours(6); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22998);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(22999);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23000);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23001);base = base.plusHours(6); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23002);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23003);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23004);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23005);base = base.plusHours(6); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23006);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23007);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23008);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23009);base = base.plusHours(6); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23010);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23011);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23012);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23013);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23014);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23015);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23016);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23017);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23018);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23019);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23020);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23021);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23022);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hnbhnble6qe98z.R.inc(23023);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 }finally{__CLR4_4_1hnbhnble6qe98z.R.flushNeeded();}} 

    

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
