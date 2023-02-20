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
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1hothotle6rckhe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,23103,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hothotle6rckhe.R.inc(22925);
        __CLR4_4_1hothotle6rckhe.R.inc(22926);String str = System.getProperty("java.version");
        __CLR4_4_1hothotle6rckhe.R.inc(22927);boolean old = true;
        __CLR4_4_1hothotle6rckhe.R.inc(22928);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hothotle6rckhe.R.iget(22929)!=0|true))||(__CLR4_4_1hothotle6rckhe.R.iget(22930)==0&false))) {{
            __CLR4_4_1hothotle6rckhe.R.inc(22931);old = false;
        }
        }__CLR4_4_1hothotle6rckhe.R.inc(22932);OLD_JDK = old;
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

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
    static {try{__CLR4_4_1hothotle6rckhe.R.inc(22933);
        // don't call Policy.getPolicy()
        __CLR4_4_1hothotle6rckhe.R.inc(22934);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hothotle6rckhe.R.inc(22935);
                __CLR4_4_1hothotle6rckhe.R.inc(22936);Permissions p = new Permissions();
                __CLR4_4_1hothotle6rckhe.R.inc(22937);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hothotle6rckhe.R.inc(22938);return p;
            }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hothotle6rckhe.R.inc(22939);
            }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hothotle6rckhe.R.inc(22940);
                __CLR4_4_1hothotle6rckhe.R.inc(22941);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hothotle6rckhe.R.iget(22942)!=0|true))||(__CLR4_4_1hothotle6rckhe.R.iget(22943)==0&false))) {{
                    __CLR4_4_1hothotle6rckhe.R.inc(22944);return false;
                }
                }__CLR4_4_1hothotle6rckhe.R.inc(22945);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
        };
        __CLR4_4_1hothotle6rckhe.R.inc(22946);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hothotle6rckhe.R.inc(22947);
                __CLR4_4_1hothotle6rckhe.R.inc(22948);Permissions p = new Permissions();
                __CLR4_4_1hothotle6rckhe.R.inc(22949);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hothotle6rckhe.R.inc(22950);return p;
            }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hothotle6rckhe.R.inc(22951);
            }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1hothotle6rckhe.R.inc(22952);
        __CLR4_4_1hothotle6rckhe.R.inc(22953);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hothotle6rckhe.R.inc(22954);
        __CLR4_4_1hothotle6rckhe.R.inc(22955);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1hothotle6rckhe.R.inc(22957);try{__CLR4_4_1hothotle6rckhe.R.inc(22956);
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hothotle6rckhe.R.inc(22958);
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hothotle6rckhe.R.inc(22959);
    }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP7() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),22960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwiglhhps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwiglhhps(){try{__CLR4_4_1hothotle6rckhe.R.inc(22960); 
     __CLR4_4_1hothotle6rckhe.R.inc(22961);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1hothotle6rckhe.R.inc(22962);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22963);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1hothotle6rckhe.R.inc(22964);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22965);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1hothotle6rckhe.R.inc(22966);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22967);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hothotle6rckhe.R.inc(22968);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22969);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hothotle6rckhe.R.inc(22970);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22971);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hothotle6rckhe.R.inc(22972);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22973);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hothotle6rckhe.R.inc(22974);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22975);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(22976);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hothotle6rckhe.R.inc(22977);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP_GJChronology130() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),22978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdcyl0hqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdcyl0hqa(){try{__CLR4_4_1hothotle6rckhe.R.inc(22978); 
     __CLR4_4_1hothotle6rckhe.R.inc(22979);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ); 
     __CLR4_4_1hothotle6rckhe.R.inc(22980);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22981);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ); 
     __CLR4_4_1hothotle6rckhe.R.inc(22982);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22983);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ); 
     __CLR4_4_1hothotle6rckhe.R.inc(22984);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22985);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ); 
     __CLR4_4_1hothotle6rckhe.R.inc(22986);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22987);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hothotle6rckhe.R.inc(22988);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22989);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hothotle6rckhe.R.inc(22990);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22991);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hothotle6rckhe.R.inc(22992);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22993);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(22994);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hothotle6rckhe.R.inc(22995);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetIntervalChronology_RInterval579() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),22996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itx7srhqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itx7srhqs(){try{__CLR4_4_1hothotle6rckhe.R.inc(22996); 
     __CLR4_4_1hothotle6rckhe.R.inc(22997);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hothotle6rckhe.R.inc(22998);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt)); 
     __CLR4_4_1hothotle6rckhe.R.inc(22999);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23000);MutableInterval ai = new MutableInterval() { 
  
         private static final long serialVersionUID = 1L; 
  
         public Chronology getChronology() {try{__CLR4_4_1hothotle6rckhe.R.inc(23001); 
             __CLR4_4_1hothotle6rckhe.R.inc(23002);return null; 
         }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hothotle6rckhe.R.inc(23003);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testClass778() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfollzhr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass778",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfollzhr0(){try{__CLR4_4_1hothotle6rckhe.R.inc(23004); 
     __CLR4_4_1hothotle6rckhe.R.inc(23005);Class<?> cls = DateTimeUtils.class; 
     __CLR4_4_1hothotle6rckhe.R.inc(23006);assertEquals(true, Modifier.isPublic(cls.getModifiers())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23007);assertEquals(false, Modifier.isFinal(cls.getModifiers())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23008);assertEquals(1, cls.getDeclaredConstructors().length); 
     __CLR4_4_1hothotle6rckhe.R.inc(23009);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23010);new DateTimeUtils() { 
     }; 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testOffsetMillis779() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzfn2thr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis779",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzfn2thr7(){try{__CLR4_4_1hothotle6rckhe.R.inc(23011); 
     __CLR4_4_1hothotle6rckhe.R.inc(23012);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(23013);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000); 
         __CLR4_4_1hothotle6rckhe.R.inc(23014);long nowSystem = System.currentTimeMillis(); 
         __CLR4_4_1hothotle6rckhe.R.inc(23015);long now = DateTimeUtils.currentTimeMillis(); 
         __CLR4_4_1hothotle6rckhe.R.inc(23016);long nowAdjustDay = now + (24 * 60 * 60 * 1000); 
         __CLR4_4_1hothotle6rckhe.R.inc(23017);assertTrue((now < nowSystem)); 
         __CLR4_4_1hothotle6rckhe.R.inc(23018);assertTrue((nowAdjustDay >= nowSystem)); 
         __CLR4_4_1hothotle6rckhe.R.inc(23019);assertTrue((nowAdjustDay - nowSystem) < 10000L); 
     } finally { 
         __CLR4_4_1hothotle6rckhe.R.inc(23020);DateTimeUtils.setCurrentMillisSystem(); 
     } 
     __CLR4_4_1hothotle6rckhe.R.inc(23021);long nowSystem = System.currentTimeMillis(); 
     __CLR4_4_1hothotle6rckhe.R.inc(23022);long now = DateTimeUtils.currentTimeMillis(); 
     __CLR4_4_1hothotle6rckhe.R.inc(23023);assertTrue((now >= nowSystem)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23024);assertTrue((now - nowSystem) < 10000L); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testMillisProvider_null780() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szz3yxhrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null780",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szz3yxhrl(){try{__CLR4_4_1hothotle6rckhe.R.inc(23025); 
     __CLR4_4_1hothotle6rckhe.R.inc(23026);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(23027);DateTimeUtils.setCurrentMillisProvider(null); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testMillisProvider781() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3n82hro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3n82hro(){try{__CLR4_4_1hothotle6rckhe.R.inc(23028); 
     __CLR4_4_1hothotle6rckhe.R.inc(23029);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(23030);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() { 
  
             public long getMillis() {try{__CLR4_4_1hothotle6rckhe.R.inc(23031); 
                 __CLR4_4_1hothotle6rckhe.R.inc(23032);return 1L; 
             }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 
         }); 
         __CLR4_4_1hothotle6rckhe.R.inc(23033);assertEquals(1L, DateTimeUtils.currentTimeMillis()); 
     } finally { 
         __CLR4_4_1hothotle6rckhe.R.inc(23034);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetInstantChronology_RI782() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ng7hrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI782",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ng7hrv(){try{__CLR4_4_1hothotle6rckhe.R.inc(23035); 
     __CLR4_4_1hothotle6rckhe.R.inc(23036);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hothotle6rckhe.R.inc(23037);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23038);Instant i = new Instant(123L); 
     __CLR4_4_1hothotle6rckhe.R.inc(23039);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23040);AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() {try{__CLR4_4_1hothotle6rckhe.R.inc(23041); 
             __CLR4_4_1hothotle6rckhe.R.inc(23042);return 0L; 
         }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 
  
         public Chronology getChronology() {try{__CLR4_4_1hothotle6rckhe.R.inc(23043); 
             __CLR4_4_1hothotle6rckhe.R.inc(23044);return null; 
         }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hothotle6rckhe.R.inc(23045);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23046);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetIntervalChronology_RI_RI783() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9c8sohs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI783",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9c8sohs7(){try{__CLR4_4_1hothotle6rckhe.R.inc(23047); 
     __CLR4_4_1hothotle6rckhe.R.inc(23048);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hothotle6rckhe.R.inc(23049);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     __CLR4_4_1hothotle6rckhe.R.inc(23050);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23051);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23052);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23053);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetReadableInterval_ReadableInterval784() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uh9e4fhse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval784",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uh9e4fhse(){try{__CLR4_4_1hothotle6rckhe.R.inc(23054); 
     __CLR4_4_1hothotle6rckhe.R.inc(23055);ReadableInterval input = new Interval(0, 100L); 
     __CLR4_4_1hothotle6rckhe.R.inc(23056);assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23057);try { 
         __CLR4_4_1hothotle6rckhe.R.inc(23058);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hothotle6rckhe.R.inc(23059);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         __CLR4_4_1hothotle6rckhe.R.inc(23060);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetZone_Zone785() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9kx4whsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone785",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9kx4whsl(){try{__CLR4_4_1hothotle6rckhe.R.inc(23061); 
     __CLR4_4_1hothotle6rckhe.R.inc(23062);assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23063);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetPeriodType_PeriodType786() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghfy2nhso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType786",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghfy2nhso(){try{__CLR4_4_1hothotle6rckhe.R.inc(23064); 
     __CLR4_4_1hothotle6rckhe.R.inc(23065);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23066);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void testGetDurationMillis_RI787() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4pvmthsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI787",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4pvmthsr(){try{__CLR4_4_1hothotle6rckhe.R.inc(23067); 
     __CLR4_4_1hothotle6rckhe.R.inc(23068);Duration dur = new Duration(123L); 
     __CLR4_4_1hothotle6rckhe.R.inc(23069);assertEquals(123L, DateTimeUtils.getDurationMillis(dur)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23070);assertEquals(0L, DateTimeUtils.getDurationMillis(null)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 


public void test_julianDay789() {__CLR4_4_1hothotle6rckhe.R.globalSliceStart(getClass().getName(),23071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljsm4bhsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hothotle6rckhe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hothotle6rckhe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljsm4bhsv(){try{__CLR4_4_1hothotle6rckhe.R.inc(23071); 
     __CLR4_4_1hothotle6rckhe.R.inc(23072);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1hothotle6rckhe.R.inc(23073);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23074);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23075);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23076);base = base.plusHours(6); 
     __CLR4_4_1hothotle6rckhe.R.inc(23077);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23078);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23079);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23080);base = base.plusHours(6); 
     __CLR4_4_1hothotle6rckhe.R.inc(23081);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23082);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23083);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23084);base = base.plusHours(6); 
     __CLR4_4_1hothotle6rckhe.R.inc(23085);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23086);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23087);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23088);base = base.plusHours(6); 
     __CLR4_4_1hothotle6rckhe.R.inc(23089);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23090);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23091);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23092);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     __CLR4_4_1hothotle6rckhe.R.inc(23093);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23094);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23095);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hothotle6rckhe.R.inc(23096);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23097);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23098);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     __CLR4_4_1hothotle6rckhe.R.inc(23099);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hothotle6rckhe.R.inc(23100);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hothotle6rckhe.R.inc(23101);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hothotle6rckhe.R.inc(23102);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 }finally{__CLR4_4_1hothotle6rckhe.R.flushNeeded();}} 

    

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
