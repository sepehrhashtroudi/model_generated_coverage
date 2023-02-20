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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1htrhtrle6rckkf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,23487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23103);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23104);String str = System.getProperty("java.version");
        __CLR4_4_1htrhtrle6rckkf.R.inc(23105);boolean old = true;
        __CLR4_4_1htrhtrle6rckkf.R.inc(23106);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1htrhtrle6rckkf.R.iget(23107)!=0|true))||(__CLR4_4_1htrhtrle6rckkf.R.iget(23108)==0&false))) {{
            __CLR4_4_1htrhtrle6rckkf.R.inc(23109);old = false;
        }
        }__CLR4_4_1htrhtrle6rckkf.R.inc(23110);OLD_JDK = old;
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23111);
        // don't call Policy.getPolicy()
        __CLR4_4_1htrhtrle6rckkf.R.inc(23112);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23113);
                __CLR4_4_1htrhtrle6rckkf.R.inc(23114);Permissions p = new Permissions();
                __CLR4_4_1htrhtrle6rckkf.R.inc(23115);p.add(new AllPermission());  // enable everything
                __CLR4_4_1htrhtrle6rckkf.R.inc(23116);return p;
            }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23117);
            }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23118);
                __CLR4_4_1htrhtrle6rckkf.R.inc(23119);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1htrhtrle6rckkf.R.iget(23120)!=0|true))||(__CLR4_4_1htrhtrle6rckkf.R.iget(23121)==0&false))) {{
                    __CLR4_4_1htrhtrle6rckkf.R.inc(23122);return false;
                }
                }__CLR4_4_1htrhtrle6rckkf.R.inc(23123);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        };
        __CLR4_4_1htrhtrle6rckkf.R.inc(23124);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23125);
                __CLR4_4_1htrhtrle6rckkf.R.inc(23126);Permissions p = new Permissions();
                __CLR4_4_1htrhtrle6rckkf.R.inc(23127);p.add(new AllPermission());  // enable everything
                __CLR4_4_1htrhtrle6rckkf.R.inc(23128);return p;
            }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23129);
            }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23130);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23131);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23132);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23133);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1htrhtrle6rckkf.R.inc(23135);try{__CLR4_4_1htrhtrle6rckkf.R.inc(23134);
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23136);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23137);locale = Locale.getDefault();
        __CLR4_4_1htrhtrle6rckkf.R.inc(23138);zone = DateTimeZone.getDefault();
        __CLR4_4_1htrhtrle6rckkf.R.inc(23139);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23140);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23141);Locale.setDefault(locale);
        __CLR4_4_1htrhtrle6rckkf.R.inc(23142);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForID_String_old266() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5dmbhuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5dmbhuv(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23143); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23144);Map<String, String> map = new LinkedHashMap<String, String>(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23145);map.put("GMT", "UTC"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23146);map.put("WET", "WET"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23147);map.put("CET", "CET"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23148);map.put("MET", "CET"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23149);map.put("ECT", "CET"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23150);map.put("EET", "EET"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23151);map.put("MIT", "Pacific/Apia"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23152);map.put("HST", "Pacific/Honolulu"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23153);map.put("AST", "America/Anchorage"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23154);map.put("PST", "America/Los_Angeles"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23155);map.put("MST", "America/Denver"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23156);map.put("PNT", "America/Phoenix"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23157);map.put("CST", "America/Chicago"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23158);map.put("EST", "America/New_York"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23159);map.put("IET", "America/Indiana/Indianapolis"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23160);map.put("PRT", "America/Puerto_Rico"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23161);map.put("CNT", "America/St_Johns"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23162);map.put("AGT", "America/Argentina/Buenos_Aires"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23163);map.put("BET", "America/Sao_Paulo"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23164);map.put("ART", "Africa/Cairo"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23165);map.put("CAT", "Africa/Harare"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23166);map.put("EAT", "Africa/Addis_Ababa"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23167);map.put("NET", "Asia/Yerevan"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23168);map.put("PLT", "Asia/Karachi"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23169);map.put("IST", "Asia/Kolkata"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23170);map.put("BST", "Asia/Dhaka"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23171);map.put("VST", "Asia/Ho_Chi_Minh"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23172);map.put("CTT", "Asia/Shanghai"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23173);map.put("JST", "Asia/Tokyo"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23174);map.put("ACT", "Australia/Darwin"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23175);map.put("AET", "Australia/Sydney"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23176);map.put("SST", "Pacific/Guadalcanal"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23177);map.put("NST", "Pacific/Auckland"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23178);for (String key : map.keySet()) {{ 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23179);String value = map.get(key); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23180);TimeZone juZone = TimeZone.getTimeZone(key); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23181);DateTimeZone zone = DateTimeZone.forTimeZone(juZone); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23182);assertEquals(value, zone.getID()); 
     } 
 }}finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testPatchedNameKeysLondon272() throws Exception {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fslg3shvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fslg3shvz() throws Exception{try{__CLR4_4_1htrhtrle6rckkf.R.inc(23183); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23184);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23185);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23186);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23187);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23188);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testIsFixed276() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pz934hw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pz934hw5(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23189); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23190);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23191);assertEquals(false, zone.isFixed()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23192);assertEquals(true, DateTimeZone.UTC.isFixed()); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testEqualsHashCode281() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjb6aihw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjb6aihw9(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23193); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23194);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23195);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23196);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23197);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23198);assertEquals(true, zone2.equals(zone1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23199);assertEquals(true, zone2.equals(zone2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23200);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23201);DateTimeZone zone3 = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23202);assertEquals(true, zone3.equals(zone3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23203);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23204);assertEquals(false, zone2.equals(zone3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23205);assertEquals(false, zone3.equals(zone1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23206);assertEquals(false, zone3.equals(zone2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23207);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23208);assertEquals(true, zone3.hashCode() == zone3.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23209);DateTimeZone zone4 = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23210);assertEquals(true, zone4.equals(zone4)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23211);assertEquals(false, zone1.equals(zone4)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23212);assertEquals(false, zone2.equals(zone4)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23213);assertEquals(false, zone3.equals(zone4)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23214);assertEquals(false, zone4.equals(zone1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23215);assertEquals(false, zone4.equals(zone2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23216);assertEquals(false, zone4.equals(zone3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23217);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23218);assertEquals(true, zone4.hashCode() == zone4.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23219);DateTimeZone zone5 = DateTimeZone.forID("+02:00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23220);assertEquals(true, zone5.equals(zone5)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23221);assertEquals(false, zone1.equals(zone5)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23222);assertEquals(false, zone2.equals(zone5)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23223);assertEquals(false, zone3.equals(zone5)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23224);assertEquals(false, zone4.equals(zone5)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23225);assertEquals(false, zone5.equals(zone1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23226);assertEquals(false, zone5.equals(zone2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23227);assertEquals(false, zone5.equals(zone3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23228);assertEquals(false, zone5.equals(zone4)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23229);assertEquals(false, zone1.hashCode() == zone5.hashCode()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23230);assertEquals(true, zone5.hashCode() == zone5.hashCode()); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testSerialization2635() throws Exception {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4omqdhxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4omqdhxb() throws Exception{try{__CLR4_4_1htrhtrle6rckkf.R.inc(23231); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23232);DateTimeZone zone = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23233);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23234);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23235);oos.writeObject(zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23236);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23237);oos.close(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23238);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23239);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23240);DateTimeZone result = (DateTimeZone) ois.readObject(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23241);ois.close(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23242);assertSame(zone, result); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testIsLocalDateTimeGap_Berlin636() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1houilnhxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1houilnhxn(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23243); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23244);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23245);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23246);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23247);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23248);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23249);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23250);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23251);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23252);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23253);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23254);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23255);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testDefault799() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wotanjhy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault799",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wotanjhy0(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23256); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23257);assertNotNull(DateTimeZone.getDefault()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23258);DateTimeZone.setDefault(PARIS); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23259);assertSame(PARIS, DateTimeZone.getDefault()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23260);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23261);DateTimeZone.setDefault(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23262);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testForOffsetHours_int800() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu6iy2hy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int800",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu6iy2hy7(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23263); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23264);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23265);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23266);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23267);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23268);DateTimeZone.forOffsetHours(999999); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23269);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testForID_String801() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej5hehye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej5hehye(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23270); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23271);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23272);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23273);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23274);zone = DateTimeZone.forID("UTC"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23275);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23276);zone = DateTimeZone.forID("+00:00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23277);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23278);zone = DateTimeZone.forID("+00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23279);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23280);zone = DateTimeZone.forID("+01:23"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23281);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23282);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23283);zone = DateTimeZone.forID("-02:00"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23284);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23285);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23286);zone = DateTimeZone.forID("-07:05:34.0"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23287);assertEquals("-07:05:34", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23288);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23289);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23290);DateTimeZone.forID("SST"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23292);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23293);DateTimeZone.forID("europe/london"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23294);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23295);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23296);DateTimeZone.forID("Europe/UK"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23298);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23299);DateTimeZone.forID("+"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23300);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23301);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23302);DateTimeZone.forID("+0"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23303);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testForTimeZone_TimeZone802() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tesfy1hzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone802",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tesfy1hzc(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23304); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23305);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23306);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23307);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23308);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23309);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23310);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23311);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23312);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23313);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23314);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23315);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23316);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23317);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23318);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23319);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23320);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23321);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23322);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23323);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23324);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23325);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23326);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23327);assertEquals("+02:00", zone.getID()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23328);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23329);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23330);assertEquals("America/New_York", zone.getID()); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testForOffsetMillis_int803() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvw8xqi03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int803",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvw8xqi03(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23331); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23332);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23333);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23334);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23335);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23336);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23337);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testProvider804() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13000kgi0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider804",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13000kgi0a(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23338); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23339);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23340);assertNotNull(DateTimeZone.getProvider()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23341);Provider provider = DateTimeZone.getProvider(); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23342);DateTimeZone.setProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23343);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23344);try { 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23345);DateTimeZone.setProvider(new MockNullIDSProvider()); 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23346);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23347);try { 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23348);DateTimeZone.setProvider(new MockEmptyIDSProvider()); 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23349);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23350);try { 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23351);DateTimeZone.setProvider(new MockNoUTCProvider()); 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23352);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23353);try { 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23354);DateTimeZone.setProvider(new MockBadUTCProvider()); 
             __CLR4_4_1htrhtrle6rckkf.R.inc(23355);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23356);Provider prov = new MockOKProvider(); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23357);DateTimeZone.setProvider(prov); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23358);assertSame(prov, DateTimeZone.getProvider()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23359);assertEquals(2, DateTimeZone.getAvailableIDs().size()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23360);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23361);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London")); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23362);DateTimeZone.setProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23363);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23364);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23365);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23366);DateTimeZone.setProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23367);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23368);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23369);DateTimeZone.setProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23370);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testNameProvider_badClassName805() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1582y5xi17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName805",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1582y5xi17(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23371); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23372);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23373);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23374);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23375);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23376);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23377);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testNameProvider806() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196x9x3i1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider806",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196x9x3i1e(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23378); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23379);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23380);assertNotNull(DateTimeZone.getNameProvider()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23381);NameProvider provider = DateTimeZone.getNameProvider(); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23382);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23383);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23384);provider = new MockOKButNullNameProvider(); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23385);DateTimeZone.setNameProvider(provider); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23386);assertSame(provider, DateTimeZone.getNameProvider()); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23387);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23388);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23389);DateTimeZone.setNameProvider(null); 
     } 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23390);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23391);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23392);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23393);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23394);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23395);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23396);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testGetShortNameNullKey807() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13k2zyni1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13k2zyni1x(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23397); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23398);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23399);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testGetNameNullKey808() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op6e2mi20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey808",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op6e2mi20(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23400); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23401);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23402);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testGetOffset_RI809() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vsduh5i23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI809",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vsduh5i23(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23403); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23404);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23405);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23406);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23407);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testGetMillisKeepLocal813() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19677x7i28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal813",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19677x7i28(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23408); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23409);long millisLondon = TEST_TIME_SUMMER; 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23410);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR; 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23411);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23412);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23413);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23414);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23415);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23416);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23417);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23418);try { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23419);DateTimeZone.setDefault(LONDON); 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23420);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis)); 
     } finally { 
         __CLR4_4_1htrhtrle6rckkf.R.inc(23421);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testGetShortNameProviderName1400() {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfzltji2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName1400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfzltji2m(){try{__CLR4_4_1htrhtrle6rckkf.R.inc(23422); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23423);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23424);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23425);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23426);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 


public void testPatchedNameKeysSydneyHistoric1401() throws Exception {__CLR4_4_1htrhtrle6rckkf.R.globalSliceStart(getClass().getName(),23427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x52ce6i2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1htrhtrle6rckkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1htrhtrle6rckkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric1401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x52ce6i2r() throws Exception{try{__CLR4_4_1htrhtrle6rckkf.R.inc(23427); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23428);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23429);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23430);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23431);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1htrhtrle6rckkf.R.inc(23432);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}} 

    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23433);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23434);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23435);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23436);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23437);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23438);return new HashSet();
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23439);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23440);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23441);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23442);Set set = new HashSet();
            __CLR4_4_1htrhtrle6rckkf.R.inc(23443);set.add("Europe/London");
            __CLR4_4_1htrhtrle6rckkf.R.inc(23444);return set;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23445);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23446);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23447);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23448);Set set = new HashSet();
            __CLR4_4_1htrhtrle6rckkf.R.inc(23449);set.add("UTC");
            __CLR4_4_1htrhtrle6rckkf.R.inc(23450);set.add("Europe/London");
            __CLR4_4_1htrhtrle6rckkf.R.inc(23451);return set;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23452);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23453);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23454);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23455);Set set = new HashSet();
            __CLR4_4_1htrhtrle6rckkf.R.inc(23456);set.add("UTC");
            __CLR4_4_1htrhtrle6rckkf.R.inc(23457);set.add("Europe/London");
            __CLR4_4_1htrhtrle6rckkf.R.inc(23458);return set;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23459);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23460);return DateTimeZone.UTC;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23461);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23462);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23463);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23464);return null;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23465);
      __CLR4_4_1htrhtrle6rckkf.R.inc(23466);boolean jdk6 = true;
      __CLR4_4_1htrhtrle6rckkf.R.inc(23467);try {
        __CLR4_4_1htrhtrle6rckkf.R.inc(23468);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1htrhtrle6rckkf.R.inc(23469);jdk6 = false;
      } 
      __CLR4_4_1htrhtrle6rckkf.R.inc(23470);JDK6 = jdk6;
    }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1htrhtrle6rckkf.R.inc(23472);try{__CLR4_4_1htrhtrle6rckkf.R.inc(23471);
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23473);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23474);return null;  // null
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23475);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23476);return 0;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23477);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23478);return 0;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23479);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23480);return false;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23481);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23482);return 0;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23483);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23484);return 0;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1htrhtrle6rckkf.R.inc(23485);
            __CLR4_4_1htrhtrle6rckkf.R.inc(23486);return false;
        }finally{__CLR4_4_1htrhtrle6rckkf.R.flushNeeded();}}
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
