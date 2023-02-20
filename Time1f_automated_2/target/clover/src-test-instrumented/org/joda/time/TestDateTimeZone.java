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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1h3fh3fle6nl85y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22155);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22156);String str = System.getProperty("java.version");
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22157);boolean old = true;
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22158);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1h3fh3fle6nl85y.R.iget(22159)!=0|true))||(__CLR4_4_1h3fh3fle6nl85y.R.iget(22160)==0&false))) {{
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22161);old = false;
        }
        }__CLR4_4_1h3fh3fle6nl85y.R.inc(22162);OLD_JDK = old;
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22163);
        // don't call Policy.getPolicy()
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22164);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22165);
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22166);Permissions p = new Permissions();
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22167);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22168);return p;
            }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22169);
            }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22170);
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22171);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1h3fh3fle6nl85y.R.iget(22172)!=0|true))||(__CLR4_4_1h3fh3fle6nl85y.R.iget(22173)==0&false))) {{
                    __CLR4_4_1h3fh3fle6nl85y.R.inc(22174);return false;
                }
                }__CLR4_4_1h3fh3fle6nl85y.R.inc(22175);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        };
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22176);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22177);
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22178);Permissions p = new Permissions();
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22179);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h3fh3fle6nl85y.R.inc(22180);return p;
            }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22181);
            }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22182);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22183);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22184);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22185);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1h3fh3fle6nl85y.R.inc(22187);try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22186);
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22188);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22189);locale = Locale.getDefault();
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22190);zone = DateTimeZone.getDefault();
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22191);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22192);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22193);Locale.setDefault(locale);
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22194);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetDayOfMonth_int_dstOverlapSummer_addZero266() {__CLR4_4_1h3fh3fle6nl85y.R.globalSliceStart(getClass().getName(),22195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fazhoh4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3fh3fle6nl85y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3fh3fle6nl85y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSetDayOfMonth_int_dstOverlapSummer_addZero266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fazhoh4j(){try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22195); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22196);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22197);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22198);test.setDayOfMonth(30); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22199);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
public void testProvider_badClassName267() {__CLR4_4_1h3fh3fle6nl85y.R.globalSliceStart(getClass().getName(),22200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rc58bkh4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3fh3fle6nl85y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3fh3fle6nl85y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rc58bkh4o(){try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22200); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22201);try { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22202);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22203);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22204);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22205);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22206);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
public void testWithMinuteOfHourInDstChange_mockZone358() {__CLR4_4_1h3fh3fle6nl85y.R.globalSliceStart(getClass().getName(),22207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tt6bvzh4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3fh3fle6nl85y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3fh3fle6nl85y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testWithMinuteOfHourInDstChange_mockZone358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tt6bvzh4v(){try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22207); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22208);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22209);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22210);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22211);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22212);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22213);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22214);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22215);DateTime testPre1 = pre.withMinuteOfHour(30); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22216);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22217);DateTime testPre2 = pre.withMinuteOfHour(50); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22218);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22219);DateTime testPost1 = post.withMinuteOfHour(30); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22220);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22221);DateTime testPost2 = post.withMinuteOfHour(10); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22222);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
public void test_DateTimeZone359() {__CLR4_4_1h3fh3fle6nl85y.R.globalSliceStart(getClass().getName(),22223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecto9ih5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h3fh3fle6nl85y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h3fh3fle6nl85y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.test_DateTimeZone359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecto9ih5b(){try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22223); 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22224);try { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22225);DateTimeZone.setDefault(DateTimeZone.UTC); 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22226);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22227);try { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22228);DateTimeZone.setDefault(null); 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22229);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h3fh3fle6nl85y.R.inc(22230);try { 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22231);DateTimeZone.setDefault(DateTimeZone.UTC); 
         __CLR4_4_1h3fh3fle6nl85y.R.inc(22232);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22233);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22234);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22235);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22236);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22237);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22238);return new HashSet();
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22239);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22240);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22241);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22242);Set set = new HashSet();
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22243);set.add("Europe/London");
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22244);return set;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22245);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22246);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22247);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22248);Set set = new HashSet();
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22249);set.add("UTC");
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22250);set.add("Europe/London");
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22251);return set;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22252);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22253);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22254);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22255);Set set = new HashSet();
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22256);set.add("UTC");
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22257);set.add("Europe/London");
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22258);return set;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22259);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22260);return DateTimeZone.UTC;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22261);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22262);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22263);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22264);return null;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22265);
      __CLR4_4_1h3fh3fle6nl85y.R.inc(22266);boolean jdk6 = true;
      __CLR4_4_1h3fh3fle6nl85y.R.inc(22267);try {
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22268);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1h3fh3fle6nl85y.R.inc(22269);jdk6 = false;
      } 
      __CLR4_4_1h3fh3fle6nl85y.R.inc(22270);JDK6 = jdk6;
    }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1h3fh3fle6nl85y.R.inc(22272);try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22271);
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22273);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22274);return null;  // null
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22275);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22276);return 0;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22277);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22278);return 0;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22279);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22280);return false;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22281);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22282);return 0;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22283);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22284);return 0;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1h3fh3fle6nl85y.R.inc(22285);
            __CLR4_4_1h3fh3fle6nl85y.R.inc(22286);return false;
        }finally{__CLR4_4_1h3fh3fle6nl85y.R.flushNeeded();}}
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
