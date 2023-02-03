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
import java.io.PrintStream;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.text.DateFormatSymbols;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1h0eh0eldnipyxp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,22140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22046);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22047);String str = System.getProperty("java.version");
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22048);boolean old = true;
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22049);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1h0eh0eldnipyxp.R.iget(22050)!=0|true))||(__CLR4_4_1h0eh0eldnipyxp.R.iget(22051)==0&false))) {{
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22052);old = false;
        }
        }__CLR4_4_1h0eh0eldnipyxp.R.inc(22053);OLD_JDK = old;
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    
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
    private long TEST_TIME_SUMMER =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-01-09
    private long TEST_TIME_WINTER =
            (y2002days + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    // 2002-04-05 Fri
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06 Tue
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22054);
        // don't call Policy.getPolicy()
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22055);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22056);
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22057);Permissions p = new Permissions();
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22058);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22059);return p;
            }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22060);
            }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22061);
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22062);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1h0eh0eldnipyxp.R.iget(22063)!=0|true))||(__CLR4_4_1h0eh0eldnipyxp.R.iget(22064)==0&false))) {{
                    __CLR4_4_1h0eh0eldnipyxp.R.inc(22065);return false;
                }
                }__CLR4_4_1h0eh0eldnipyxp.R.inc(22066);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        };
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22067);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22068);
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22069);Permissions p = new Permissions();
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22070);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h0eh0eldnipyxp.R.inc(22071);return p;
            }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22072);
            }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22073);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22074);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22075);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22076);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1h0eh0eldnipyxp.R.inc(22078);try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22077);
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22079);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22080);locale = Locale.getDefault();
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22081);zone = DateTimeZone.getDefault();
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22082);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22083);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22084);Locale.setDefault(locale);
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22085);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22086);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22087);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22088);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22089);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22090);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22091);return new HashSet();
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22092);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22093);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22094);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22095);Set set = new HashSet();
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22096);set.add("Europe/London");
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22097);return set;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22098);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22099);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22100);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22101);Set set = new HashSet();
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22102);set.add("UTC");
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22103);set.add("Europe/London");
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22104);return set;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22105);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22106);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22107);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22108);Set set = new HashSet();
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22109);set.add("UTC");
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22110);set.add("Europe/London");
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22111);return set;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22112);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22113);return DateTimeZone.UTC;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22114);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22115);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22116);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22117);return null;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22118);
      __CLR4_4_1h0eh0eldnipyxp.R.inc(22119);boolean jdk6 = true;
      __CLR4_4_1h0eh0eldnipyxp.R.inc(22120);try {
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22121);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1h0eh0eldnipyxp.R.inc(22122);jdk6 = false;
      } 
      __CLR4_4_1h0eh0eldnipyxp.R.inc(22123);JDK6 = jdk6;
    }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}

    
// Defects4J: flaky method
//     public void testGetShortName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER));
//         assertEquals("GMT", zone.getShortName(TEST_TIME_WINTER));
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    
// Defects4J: flaky method
//     public void testGetShortName_berlin() {
//         DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//         assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.ENGLISH));
//         assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//         if (JDK6) {
//           assertEquals("MEZ", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("MESZ", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         } else {
//           assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         }
//     }

    

    

    
// Defects4J: flaky method
//     public void testGetName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER));
//         assertEquals("Greenwich Mean Time", zone.getName(TEST_TIME_WINTER));
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    
// Defects4J: flaky method
//     public void testGetName_berlin() {
//       DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//       assertEquals("Central European Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
//       assertEquals("Central European Summer Time", berlin.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//       if (JDK6) {
//         assertEquals("Mitteleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       } else {
//         assertEquals("Zentraleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Zentraleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       }
//   }

    

    

    static class MockDateTimeZone extends DateTimeZone {
        public MockDateTimeZone(String id) {
            super(id);__CLR4_4_1h0eh0eldnipyxp.R.inc(22125);try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22124);
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22126);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22127);return null;  // null
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22128);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22129);return 0;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22130);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22131);return 0;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22132);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22133);return false;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22134);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22135);return 0;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22136);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22137);return 0;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1h0eh0eldnipyxp.R.inc(22138);
            __CLR4_4_1h0eh0eldnipyxp.R.inc(22139);return false;
        }finally{__CLR4_4_1h0eh0eldnipyxp.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_Berlin() {
//        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 3, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 4, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }
//
//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_NewYork() {
//        DateTimeZone zone = DateTimeZone.forID("America/New_York");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 2, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 3, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}
