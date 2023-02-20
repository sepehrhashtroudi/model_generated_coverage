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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1hashasle6ndpel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22566,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hashasle6ndpel.R.inc(22420);
        __CLR4_4_1hashasle6ndpel.R.inc(22421);String str = System.getProperty("java.version");
        __CLR4_4_1hashasle6ndpel.R.inc(22422);boolean old = true;
        __CLR4_4_1hashasle6ndpel.R.inc(22423);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hashasle6ndpel.R.iget(22424)!=0|true))||(__CLR4_4_1hashasle6ndpel.R.iget(22425)==0&false))) {{
            __CLR4_4_1hashasle6ndpel.R.inc(22426);old = false;
        }
        }__CLR4_4_1hashasle6ndpel.R.inc(22427);OLD_JDK = old;
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1hashasle6ndpel.R.inc(22428);
        // don't call Policy.getPolicy()
        __CLR4_4_1hashasle6ndpel.R.inc(22429);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hashasle6ndpel.R.inc(22430);
                __CLR4_4_1hashasle6ndpel.R.inc(22431);Permissions p = new Permissions();
                __CLR4_4_1hashasle6ndpel.R.inc(22432);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hashasle6ndpel.R.inc(22433);return p;
            }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hashasle6ndpel.R.inc(22434);
            }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hashasle6ndpel.R.inc(22435);
                __CLR4_4_1hashasle6ndpel.R.inc(22436);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hashasle6ndpel.R.iget(22437)!=0|true))||(__CLR4_4_1hashasle6ndpel.R.iget(22438)==0&false))) {{
                    __CLR4_4_1hashasle6ndpel.R.inc(22439);return false;
                }
                }__CLR4_4_1hashasle6ndpel.R.inc(22440);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        };
        __CLR4_4_1hashasle6ndpel.R.inc(22441);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hashasle6ndpel.R.inc(22442);
                __CLR4_4_1hashasle6ndpel.R.inc(22443);Permissions p = new Permissions();
                __CLR4_4_1hashasle6ndpel.R.inc(22444);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hashasle6ndpel.R.inc(22445);return p;
            }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hashasle6ndpel.R.inc(22446);
            }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1hashasle6ndpel.R.inc(22447);
        __CLR4_4_1hashasle6ndpel.R.inc(22448);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hashasle6ndpel.R.inc(22449);
        __CLR4_4_1hashasle6ndpel.R.inc(22450);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1hashasle6ndpel.R.inc(22452);try{__CLR4_4_1hashasle6ndpel.R.inc(22451);
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hashasle6ndpel.R.inc(22453);
        __CLR4_4_1hashasle6ndpel.R.inc(22454);locale = Locale.getDefault();
        __CLR4_4_1hashasle6ndpel.R.inc(22455);zone = DateTimeZone.getDefault();
        __CLR4_4_1hashasle6ndpel.R.inc(22456);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hashasle6ndpel.R.inc(22457);
        __CLR4_4_1hashasle6ndpel.R.inc(22458);Locale.setDefault(locale);
        __CLR4_4_1hashasle6ndpel.R.inc(22459);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testNameProvider98() {__CLR4_4_1hashasle6ndpel.R.globalSliceStart(getClass().getName(),22460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzbpm4hbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hashasle6ndpel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hashasle6ndpel.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzbpm4hbw(){try{__CLR4_4_1hashasle6ndpel.R.inc(22460); 
     __CLR4_4_1hashasle6ndpel.R.inc(22461);try { 
         __CLR4_4_1hashasle6ndpel.R.inc(22462);assertNotNull(DateTimeZone.getNameProvider()); 
         __CLR4_4_1hashasle6ndpel.R.inc(22463);NameProvider provider = DateTimeZone.getNameProvider(); 
         __CLR4_4_1hashasle6ndpel.R.inc(22464);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hashasle6ndpel.R.inc(22465);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         __CLR4_4_1hashasle6ndpel.R.inc(22466);provider = new MockOKButNullNameProvider(); 
         __CLR4_4_1hashasle6ndpel.R.inc(22467);DateTimeZone.setNameProvider(provider); 
         __CLR4_4_1hashasle6ndpel.R.inc(22468);assertSame(provider, DateTimeZone.getNameProvider()); 
         __CLR4_4_1hashasle6ndpel.R.inc(22469);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         __CLR4_4_1hashasle6ndpel.R.inc(22470);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         __CLR4_4_1hashasle6ndpel.R.inc(22471);DateTimeZone.setNameProvider(null); 
     } 
     __CLR4_4_1hashasle6ndpel.R.inc(22472);try { 
         __CLR4_4_1hashasle6ndpel.R.inc(22473);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         __CLR4_4_1hashasle6ndpel.R.inc(22474);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hashasle6ndpel.R.inc(22475);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1hashasle6ndpel.R.inc(22476);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1hashasle6ndpel.R.inc(22477);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hashasle6ndpel.R.inc(22478);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
public void testGetShortNameProviderName694() {__CLR4_4_1hashasle6ndpel.R.globalSliceStart(getClass().getName(),22479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1oztzhcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hashasle6ndpel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hashasle6ndpel.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1oztzhcf(){try{__CLR4_4_1hashasle6ndpel.R.inc(22479); 
     __CLR4_4_1hashasle6ndpel.R.inc(22480);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); 
     __CLR4_4_1hashasle6ndpel.R.inc(22481);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); 
     __CLR4_4_1hashasle6ndpel.R.inc(22482);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22483);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); 
 }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
public void testPatchedNameKeysSydneyHistoric695() throws Exception {__CLR4_4_1hashasle6ndpel.R.globalSliceStart(getClass().getName(),22484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqgckehck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hashasle6ndpel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hashasle6ndpel.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqgckehck() throws Exception{try{__CLR4_4_1hashasle6ndpel.R.inc(22484); 
     __CLR4_4_1hashasle6ndpel.R.inc(22485);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); 
     __CLR4_4_1hashasle6ndpel.R.inc(22486);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1hashasle6ndpel.R.inc(22487);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22488);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22489);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
public void testPropertyGetEra697() {__CLR4_4_1hashasle6ndpel.R.globalSliceStart(getClass().getName(),22490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubn6hihcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hashasle6ndpel.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hashasle6ndpel.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPropertyGetEra697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubn6hihcq(){try{__CLR4_4_1hashasle6ndpel.R.inc(22490); 
     __CLR4_4_1hashasle6ndpel.R.inc(22491);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hashasle6ndpel.R.inc(22492);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22493);assertEquals("era", test.era().getName()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22494);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22495);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22496);assertEquals(1, test.era().get()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22497);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22498);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22499);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22500);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22501);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22502);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22503);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22504);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22505);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22506);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22507);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1hashasle6ndpel.R.inc(22508);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22509);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22510);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1hashasle6ndpel.R.inc(22511);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hashasle6ndpel.R.inc(22512);
            __CLR4_4_1hashasle6ndpel.R.inc(22513);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hashasle6ndpel.R.inc(22514);
            __CLR4_4_1hashasle6ndpel.R.inc(22515);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hashasle6ndpel.R.inc(22516);
            __CLR4_4_1hashasle6ndpel.R.inc(22517);return new HashSet();
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hashasle6ndpel.R.inc(22518);
            __CLR4_4_1hashasle6ndpel.R.inc(22519);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hashasle6ndpel.R.inc(22520);
            __CLR4_4_1hashasle6ndpel.R.inc(22521);Set set = new HashSet();
            __CLR4_4_1hashasle6ndpel.R.inc(22522);set.add("Europe/London");
            __CLR4_4_1hashasle6ndpel.R.inc(22523);return set;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hashasle6ndpel.R.inc(22524);
            __CLR4_4_1hashasle6ndpel.R.inc(22525);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hashasle6ndpel.R.inc(22526);
            __CLR4_4_1hashasle6ndpel.R.inc(22527);Set set = new HashSet();
            __CLR4_4_1hashasle6ndpel.R.inc(22528);set.add("UTC");
            __CLR4_4_1hashasle6ndpel.R.inc(22529);set.add("Europe/London");
            __CLR4_4_1hashasle6ndpel.R.inc(22530);return set;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hashasle6ndpel.R.inc(22531);
            __CLR4_4_1hashasle6ndpel.R.inc(22532);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hashasle6ndpel.R.inc(22533);
            __CLR4_4_1hashasle6ndpel.R.inc(22534);Set set = new HashSet();
            __CLR4_4_1hashasle6ndpel.R.inc(22535);set.add("UTC");
            __CLR4_4_1hashasle6ndpel.R.inc(22536);set.add("Europe/London");
            __CLR4_4_1hashasle6ndpel.R.inc(22537);return set;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hashasle6ndpel.R.inc(22538);
            __CLR4_4_1hashasle6ndpel.R.inc(22539);return DateTimeZone.UTC;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hashasle6ndpel.R.inc(22540);
            __CLR4_4_1hashasle6ndpel.R.inc(22541);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hashasle6ndpel.R.inc(22542);
            __CLR4_4_1hashasle6ndpel.R.inc(22543);return null;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1hashasle6ndpel.R.inc(22544);
      __CLR4_4_1hashasle6ndpel.R.inc(22545);boolean jdk6 = true;
      __CLR4_4_1hashasle6ndpel.R.inc(22546);try {
        __CLR4_4_1hashasle6ndpel.R.inc(22547);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1hashasle6ndpel.R.inc(22548);jdk6 = false;
      } 
      __CLR4_4_1hashasle6ndpel.R.inc(22549);JDK6 = jdk6;
    }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1hashasle6ndpel.R.inc(22551);try{__CLR4_4_1hashasle6ndpel.R.inc(22550);
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1hashasle6ndpel.R.inc(22552);
            __CLR4_4_1hashasle6ndpel.R.inc(22553);return null;  // null
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1hashasle6ndpel.R.inc(22554);
            __CLR4_4_1hashasle6ndpel.R.inc(22555);return 0;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1hashasle6ndpel.R.inc(22556);
            __CLR4_4_1hashasle6ndpel.R.inc(22557);return 0;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1hashasle6ndpel.R.inc(22558);
            __CLR4_4_1hashasle6ndpel.R.inc(22559);return false;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1hashasle6ndpel.R.inc(22560);
            __CLR4_4_1hashasle6ndpel.R.inc(22561);return 0;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1hashasle6ndpel.R.inc(22562);
            __CLR4_4_1hashasle6ndpel.R.inc(22563);return 0;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1hashasle6ndpel.R.inc(22564);
            __CLR4_4_1hashasle6ndpel.R.inc(22565);return false;
        }finally{__CLR4_4_1hashasle6ndpel.R.flushNeeded();}}
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
