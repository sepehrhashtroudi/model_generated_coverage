/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.chrono.gj;

import java.util.Random;

import junit.framework.TestCase;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * Tests either the Julian or Gregorian chronology from org.joda.time.chrono.gj
 * against the implementations in this package. It tests all the date fields
 * against their principal methods.
 * <p>
 * Randomly generated values are fed into the DateTimeField methods and the
 * results are compared between the two chronologies. If any result doesn't
 * match, an error report is generated and the program exits. Each time this
 * test program is run, the pseudo random number generator is seeded with the
 * same value. This ensures consistent results between test runs.
 * <p>
 * The main method accepts three optional arguments: iterations, mode, seed. By
 * default, iterations is set to 1,000,000. The test will take several minutes
 * to run, depending on the computer's performance. Every 5 seconds a progress
 * message is printed.
 * <p>
 * The mode can be either 'g' for proleptic gregorian (the default) or 'j' for
 * proleptic julian. To override the default random number generator seed, pass
 * in a third argument which accepts a long signed integer.
 *
 * @author Brian S O'Neill
 */
public class MainTest extends TestCase {static class __CLR4_4_1kttkttle6ndpy9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,27240,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final int GREGORIAN_MODE = 0;
    public static final int JULIAN_MODE = 1;

    private static final long MILLIS_PER_YEAR = (long)365.2425 * 24 * 60 * 60 * 1000;
    private static final long _1000_YEARS = 1000 * MILLIS_PER_YEAR;
    private static final long _500_YEARS = 500 * MILLIS_PER_YEAR;
    private static final long MAX_MILLIS = (10000 - 1970) * MILLIS_PER_YEAR;
    private static final long MIN_MILLIS = (-10000 - 1970) * MILLIS_PER_YEAR;

    // Show progess reports every 5 seconds.
    private static final long UPDATE_INTERVAL = 5000;

    /**
     * Arguments: iterations [mode [seed]]
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_1kttkttle6ndpy9.R.inc(26993);
        __CLR4_4_1kttkttle6ndpy9.R.inc(26994);int iterations = 1000000;
        __CLR4_4_1kttkttle6ndpy9.R.inc(26995);int mode = GREGORIAN_MODE;
        __CLR4_4_1kttkttle6ndpy9.R.inc(26996);long seed = 1345435247779935L;

        __CLR4_4_1kttkttle6ndpy9.R.inc(26997);if ((((args.length > 0)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(26998)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(26999)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27000);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27001);if ((((args.length > 1)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27002)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27003)==0&false))) {{
                __CLR4_4_1kttkttle6ndpy9.R.inc(27004);if ((((args[1].startsWith("g"))&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27005)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27006)==0&false))) {{
                    __CLR4_4_1kttkttle6ndpy9.R.inc(27007);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1kttkttle6ndpy9.R.inc(27008);if ((((args[1].startsWith("j"))&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27009)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27010)==0&false))) {{
                    __CLR4_4_1kttkttle6ndpy9.R.inc(27011);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1kttkttle6ndpy9.R.inc(27012);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1kttkttle6ndpy9.R.inc(27013);if ((((args.length > 2)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27014)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27015)==0&false))) {{
                    __CLR4_4_1kttkttle6ndpy9.R.inc(27016);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1kttkttle6ndpy9.R.inc(27017);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}
    public void testChronology() {__CLR4_4_1kttkttle6ndpy9.R.globalSliceStart(getClass().getName(),27018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nkui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kttkttle6ndpy9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kttkttle6ndpy9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nkui(){try{__CLR4_4_1kttkttle6ndpy9.R.inc(27018);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27019);int iterations = iIterations;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27020);long seed = iSeed;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27021);String modeStr;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27022);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27023)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27024)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27025);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27026);modeStr = "Julian";
        }

        }__CLR4_4_1kttkttle6ndpy9.R.inc(27027);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1kttkttle6ndpy9.R.inc(27028);Random rnd = new Random(seed);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27029);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1kttkttle6ndpy9.R.inc(27030);for (int i=0; (((i<iterations)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27031)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27032)==0&false)); i++) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27033);long now = System.currentTimeMillis();
            __CLR4_4_1kttkttle6ndpy9.R.inc(27034);if ((((now >= updateMillis)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27035)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27036)==0&false))) {{
                __CLR4_4_1kttkttle6ndpy9.R.inc(27037);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1kttkttle6ndpy9.R.inc(27038);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1kttkttle6ndpy9.R.inc(27039);if ((((complete < 100)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27040)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27041)==0&false))) {{
                    __CLR4_4_1kttkttle6ndpy9.R.inc(27042);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1kttkttle6ndpy9.R.inc(27043);long millis = randomMillis(rnd);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27044);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1kttkttle6ndpy9.R.inc(27045);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1kttkttle6ndpy9.R.inc(27046);try {
                __CLR4_4_1kttkttle6ndpy9.R.inc(27047);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1kttkttle6ndpy9.R.inc(27048);System.out.println("Failure index: " + i);
                __CLR4_4_1kttkttle6ndpy9.R.inc(27049);System.out.println("Test millis: " + millis);
                __CLR4_4_1kttkttle6ndpy9.R.inc(27050);System.out.println("Test value: " + value);
                __CLR4_4_1kttkttle6ndpy9.R.inc(27051);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1kttkttle6ndpy9.R.inc(27052);fail(e.getMessage());
            }
        }

        }__CLR4_4_1kttkttle6ndpy9.R.inc(27053);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private final int iIterations;
    private final int iMode;
    private final long iSeed;
    private final Chronology iTest;
    private final Chronology iActual;

    /**
     * @param iterations number of test iterations to perform
     * @param mode GREGORIAN_MODE or JULIAN_MODE,0=Gregorian, 1=Julian
     * @param seed seed for random number generator
     */
    public MainTest(int iterations, int mode, long seed) {
        super("testChronology");__CLR4_4_1kttkttle6ndpy9.R.inc(27055);try{__CLR4_4_1kttkttle6ndpy9.R.inc(27054);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27056);iIterations = iterations;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27057);iMode = mode;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27058);iSeed = seed;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27059);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27060)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27061)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27062);iTest = new TestGregorianChronology();
            __CLR4_4_1kttkttle6ndpy9.R.inc(27063);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27064);iTest = new TestJulianChronology();
            __CLR4_4_1kttkttle6ndpy9.R.inc(27065);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27066);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27067);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27068);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27069);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27070);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27071);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27072);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27073);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27074);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27075);int a, b;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27076);long x, y;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27077);boolean m, n;

        // get test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27078);a = fieldA.get(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27079);b = fieldB.get(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27080);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1kttkttle6ndpy9.R.inc(27081);Class fieldClass = fieldA.getClass();
        __CLR4_4_1kttkttle6ndpy9.R.inc(27082);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27083)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27084)==0&false))) {{
            
            __CLR4_4_1kttkttle6ndpy9.R.inc(27085);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27086);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27087);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1kttkttle6ndpy9.R.inc(27088);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27089);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27090);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27091)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27092)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27093);x = fieldA.set(millis, a);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27094);y = fieldB.set(millis, b);
            __CLR4_4_1kttkttle6ndpy9.R.inc(27095);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1kttkttle6ndpy9.R.inc(27096);x = fieldA.roundFloor(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27097);y = fieldB.roundFloor(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27098);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27099);x = fieldA.roundCeiling(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27100);y = fieldB.roundCeiling(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27101);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27102);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27103);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27104);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27105);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27106);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27107);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27108);x = fieldA.remainder(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27109);y = fieldB.remainder(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27110);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27111);x = fieldA.add(millis, value);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27112);y = fieldB.add(millis, value);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27113);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27114);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27115);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27116);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27117);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27118);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27119);try {
            __CLR4_4_1kttkttle6ndpy9.R.inc(27120);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1kttkttle6ndpy9.R.inc(27121);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1kttkttle6ndpy9.R.inc(27122);throw e;
        }

        // isLeap test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27123);m = fieldA.isLeap(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27124);n = fieldB.isLeap(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27125);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1kttkttle6ndpy9.R.inc(27126);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27127);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27128);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27129);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27130);if ((((minValue >= maxValue)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27131)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27132)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27133);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1kttkttle6ndpy9.R.inc(27134);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1kttkttle6ndpy9.R.inc(27135);value -= minValue;

        __CLR4_4_1kttkttle6ndpy9.R.inc(27136);if ((((value >= 0)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27137)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27138)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27139);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1kttkttle6ndpy9.R.inc(27140);int remByRange = (-value) % wrapRange;

        __CLR4_4_1kttkttle6ndpy9.R.inc(27141);if ((((remByRange == 0)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27142)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27143)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27144);return 0 + minValue;
        }
        }__CLR4_4_1kttkttle6ndpy9.R.inc(27145);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27146);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27147);if ((((valueA != valueB)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27148)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27149)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27150);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27151);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27152);if ((((millisA != millisB)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27153)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27154)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27155);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27156);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27157);if ((((millisA != millisB)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27158)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27159)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27160);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27161);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27162);if ((((boolA != boolB)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27163)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27164)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27165);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27166);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27167);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27168);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kttkttle6ndpy9.R.inc(27169);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27170);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27171);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27172);throw new RuntimeException();
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27173);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27174);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27175);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kttkttle6ndpy9.R.inc(27176);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27177);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27178);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27179);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27180);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27181);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27182);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27183);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27184);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27185);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27186);throw new RuntimeException();
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27187);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27188);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27189);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kttkttle6ndpy9.R.inc(27190);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27191);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27192);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27193);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27194);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27195);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27196);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27197);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27198);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27199);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27200);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27201);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27202);throw new RuntimeException();
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27203);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27204);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27205);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kttkttle6ndpy9.R.inc(27206);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27207);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27208);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27209);throw new RuntimeException();
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27210);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27211);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27212)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27213)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27214);return fieldA.getName();
        } }else {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27215);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27216);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27217);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27218);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27219);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27220);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27221);return makeDate(millis, iActual);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27222);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27223);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27224);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27225);long millis = rnd.nextLong();
        __CLR4_4_1kttkttle6ndpy9.R.inc(27226);if ((((millis >= 0)&&(__CLR4_4_1kttkttle6ndpy9.R.iget(27227)!=0|true))||(__CLR4_4_1kttkttle6ndpy9.R.iget(27228)==0&false))) {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27229);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1kttkttle6ndpy9.R.inc(27230);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1kttkttle6ndpy9.R.inc(27231);return millis;
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1kttkttle6ndpy9.R.inc(27232);
        __CLR4_4_1kttkttle6ndpy9.R.inc(27233);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27234);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27235);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27236);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27237);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27238);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1kttkttle6ndpy9.R.inc(27239);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1kttkttle6ndpy9.R.flushNeeded();}}

}
