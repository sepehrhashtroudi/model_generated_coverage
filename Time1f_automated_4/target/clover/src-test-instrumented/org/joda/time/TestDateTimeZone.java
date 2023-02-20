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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1h55h55le6o79mk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22331,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1h55h55le6o79mk.R.inc(22217);
        __CLR4_4_1h55h55le6o79mk.R.inc(22218);String str = System.getProperty("java.version");
        __CLR4_4_1h55h55le6o79mk.R.inc(22219);boolean old = true;
        __CLR4_4_1h55h55le6o79mk.R.inc(22220);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1h55h55le6o79mk.R.iget(22221)!=0|true))||(__CLR4_4_1h55h55le6o79mk.R.iget(22222)==0&false))) {{
            __CLR4_4_1h55h55le6o79mk.R.inc(22223);old = false;
        }
        }__CLR4_4_1h55h55le6o79mk.R.inc(22224);OLD_JDK = old;
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1h55h55le6o79mk.R.inc(22225);
        // don't call Policy.getPolicy()
        __CLR4_4_1h55h55le6o79mk.R.inc(22226);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22227);
                __CLR4_4_1h55h55le6o79mk.R.inc(22228);Permissions p = new Permissions();
                __CLR4_4_1h55h55le6o79mk.R.inc(22229);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h55h55le6o79mk.R.inc(22230);return p;
            }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22231);
            }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22232);
                __CLR4_4_1h55h55le6o79mk.R.inc(22233);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1h55h55le6o79mk.R.iget(22234)!=0|true))||(__CLR4_4_1h55h55le6o79mk.R.iget(22235)==0&false))) {{
                    __CLR4_4_1h55h55le6o79mk.R.inc(22236);return false;
                }
                }__CLR4_4_1h55h55le6o79mk.R.inc(22237);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        };
        __CLR4_4_1h55h55le6o79mk.R.inc(22238);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22239);
                __CLR4_4_1h55h55le6o79mk.R.inc(22240);Permissions p = new Permissions();
                __CLR4_4_1h55h55le6o79mk.R.inc(22241);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h55h55le6o79mk.R.inc(22242);return p;
            }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22243);
            }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22244);
        __CLR4_4_1h55h55le6o79mk.R.inc(22245);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22246);
        __CLR4_4_1h55h55le6o79mk.R.inc(22247);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1h55h55le6o79mk.R.inc(22249);try{__CLR4_4_1h55h55le6o79mk.R.inc(22248);
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h55h55le6o79mk.R.inc(22250);
        __CLR4_4_1h55h55le6o79mk.R.inc(22251);locale = Locale.getDefault();
        __CLR4_4_1h55h55le6o79mk.R.inc(22252);zone = DateTimeZone.getDefault();
        __CLR4_4_1h55h55le6o79mk.R.inc(22253);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h55h55le6o79mk.R.inc(22254);
        __CLR4_4_1h55h55le6o79mk.R.inc(22255);Locale.setDefault(locale);
        __CLR4_4_1h55h55le6o79mk.R.inc(22256);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testNameProvider_badClassName306() {__CLR4_4_1h55h55le6o79mk.R.globalSliceStart(getClass().getName(),22257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5cd9th69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h55h55le6o79mk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h55h55le6o79mk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5cd9th69(){try{__CLR4_4_1h55h55le6o79mk.R.inc(22257); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22258);try { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22259);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); 
         __CLR4_4_1h55h55le6o79mk.R.inc(22260);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22261);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22262);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1h55h55le6o79mk.R.inc(22263);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
public void testProvider_badClassName307() {__CLR4_4_1h55h55le6o79mk.R.globalSliceStart(getClass().getName(),22264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b6thjh6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h55h55le6o79mk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h55h55le6o79mk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b6thjh6g(){try{__CLR4_4_1h55h55le6o79mk.R.inc(22264); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22265);try { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22266);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1h55h55le6o79mk.R.inc(22267);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22268);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1h55h55le6o79mk.R.inc(22269);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1h55h55le6o79mk.R.inc(22270);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
public void testPatchedNameKeysLondon308() throws Exception {__CLR4_4_1h55h55le6o79mk.R.globalSliceStart(getClass().getName(),22271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wt1nuyh6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h55h55le6o79mk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h55h55le6o79mk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wt1nuyh6n() throws Exception{try{__CLR4_4_1h55h55le6o79mk.R.inc(22271); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22272);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22273);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22274);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22275);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1h55h55le6o79mk.R.inc(22276);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22277);
            __CLR4_4_1h55h55le6o79mk.R.inc(22278);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22279);
            __CLR4_4_1h55h55le6o79mk.R.inc(22280);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22281);
            __CLR4_4_1h55h55le6o79mk.R.inc(22282);return new HashSet();
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22283);
            __CLR4_4_1h55h55le6o79mk.R.inc(22284);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22285);
            __CLR4_4_1h55h55le6o79mk.R.inc(22286);Set set = new HashSet();
            __CLR4_4_1h55h55le6o79mk.R.inc(22287);set.add("Europe/London");
            __CLR4_4_1h55h55le6o79mk.R.inc(22288);return set;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22289);
            __CLR4_4_1h55h55le6o79mk.R.inc(22290);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22291);
            __CLR4_4_1h55h55le6o79mk.R.inc(22292);Set set = new HashSet();
            __CLR4_4_1h55h55le6o79mk.R.inc(22293);set.add("UTC");
            __CLR4_4_1h55h55le6o79mk.R.inc(22294);set.add("Europe/London");
            __CLR4_4_1h55h55le6o79mk.R.inc(22295);return set;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22296);
            __CLR4_4_1h55h55le6o79mk.R.inc(22297);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22298);
            __CLR4_4_1h55h55le6o79mk.R.inc(22299);Set set = new HashSet();
            __CLR4_4_1h55h55le6o79mk.R.inc(22300);set.add("UTC");
            __CLR4_4_1h55h55le6o79mk.R.inc(22301);set.add("Europe/London");
            __CLR4_4_1h55h55le6o79mk.R.inc(22302);return set;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22303);
            __CLR4_4_1h55h55le6o79mk.R.inc(22304);return DateTimeZone.UTC;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22305);
            __CLR4_4_1h55h55le6o79mk.R.inc(22306);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22307);
            __CLR4_4_1h55h55le6o79mk.R.inc(22308);return null;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1h55h55le6o79mk.R.inc(22309);
      __CLR4_4_1h55h55le6o79mk.R.inc(22310);boolean jdk6 = true;
      __CLR4_4_1h55h55le6o79mk.R.inc(22311);try {
        __CLR4_4_1h55h55le6o79mk.R.inc(22312);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1h55h55le6o79mk.R.inc(22313);jdk6 = false;
      } 
      __CLR4_4_1h55h55le6o79mk.R.inc(22314);JDK6 = jdk6;
    }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1h55h55le6o79mk.R.inc(22316);try{__CLR4_4_1h55h55le6o79mk.R.inc(22315);
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22317);
            __CLR4_4_1h55h55le6o79mk.R.inc(22318);return null;  // null
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22319);
            __CLR4_4_1h55h55le6o79mk.R.inc(22320);return 0;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22321);
            __CLR4_4_1h55h55le6o79mk.R.inc(22322);return 0;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1h55h55le6o79mk.R.inc(22323);
            __CLR4_4_1h55h55le6o79mk.R.inc(22324);return false;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22325);
            __CLR4_4_1h55h55le6o79mk.R.inc(22326);return 0;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22327);
            __CLR4_4_1h55h55le6o79mk.R.inc(22328);return 0;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1h55h55le6o79mk.R.inc(22329);
            __CLR4_4_1h55h55le6o79mk.R.inc(22330);return false;
        }finally{__CLR4_4_1h55h55le6o79mk.R.flushNeeded();}}
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
