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
public class MainTest extends TestCase {static class __CLR4_4_1s17s17lc8axesm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,36578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1s17s17lc8axesm.R.inc(36331);
        __CLR4_4_1s17s17lc8axesm.R.inc(36332);int iterations = 1000000;
        __CLR4_4_1s17s17lc8axesm.R.inc(36333);int mode = GREGORIAN_MODE;
        __CLR4_4_1s17s17lc8axesm.R.inc(36334);long seed = 1345435247779935L;

        __CLR4_4_1s17s17lc8axesm.R.inc(36335);if ((((args.length > 0)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36336)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36337)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36338);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1s17s17lc8axesm.R.inc(36339);if ((((args.length > 1)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36340)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36341)==0&false))) {{
                __CLR4_4_1s17s17lc8axesm.R.inc(36342);if ((((args[1].startsWith("g"))&&(__CLR4_4_1s17s17lc8axesm.R.iget(36343)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36344)==0&false))) {{
                    __CLR4_4_1s17s17lc8axesm.R.inc(36345);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1s17s17lc8axesm.R.inc(36346);if ((((args[1].startsWith("j"))&&(__CLR4_4_1s17s17lc8axesm.R.iget(36347)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36348)==0&false))) {{
                    __CLR4_4_1s17s17lc8axesm.R.inc(36349);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1s17s17lc8axesm.R.inc(36350);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1s17s17lc8axesm.R.inc(36351);if ((((args.length > 2)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36352)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36353)==0&false))) {{
                    __CLR4_4_1s17s17lc8axesm.R.inc(36354);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1s17s17lc8axesm.R.inc(36355);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    public void testChronology() {__CLR4_4_1s17s17lc8axesm.R.globalSliceStart(getClass().getName(),36356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86ns1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s17s17lc8axesm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s17s17lc8axesm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86ns1w(){try{__CLR4_4_1s17s17lc8axesm.R.inc(36356);
        __CLR4_4_1s17s17lc8axesm.R.inc(36357);int iterations = iIterations;
        __CLR4_4_1s17s17lc8axesm.R.inc(36358);long seed = iSeed;
        __CLR4_4_1s17s17lc8axesm.R.inc(36359);String modeStr;
        __CLR4_4_1s17s17lc8axesm.R.inc(36360);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36361)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36362)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36363);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36364);modeStr = "Julian";
        }

        }__CLR4_4_1s17s17lc8axesm.R.inc(36365);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1s17s17lc8axesm.R.inc(36366);Random rnd = new Random(seed);
        __CLR4_4_1s17s17lc8axesm.R.inc(36367);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1s17s17lc8axesm.R.inc(36368);for (int i=0; (((i<iterations)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36369)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36370)==0&false)); i++) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36371);long now = System.currentTimeMillis();
            __CLR4_4_1s17s17lc8axesm.R.inc(36372);if ((((now >= updateMillis)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36373)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36374)==0&false))) {{
                __CLR4_4_1s17s17lc8axesm.R.inc(36375);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1s17s17lc8axesm.R.inc(36376);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1s17s17lc8axesm.R.inc(36377);if ((((complete < 100)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36378)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36379)==0&false))) {{
                    __CLR4_4_1s17s17lc8axesm.R.inc(36380);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1s17s17lc8axesm.R.inc(36381);long millis = randomMillis(rnd);
            __CLR4_4_1s17s17lc8axesm.R.inc(36382);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1s17s17lc8axesm.R.inc(36383);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1s17s17lc8axesm.R.inc(36384);try {
                __CLR4_4_1s17s17lc8axesm.R.inc(36385);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1s17s17lc8axesm.R.inc(36386);System.out.println("Failure index: " + i);
                __CLR4_4_1s17s17lc8axesm.R.inc(36387);System.out.println("Test millis: " + millis);
                __CLR4_4_1s17s17lc8axesm.R.inc(36388);System.out.println("Test value: " + value);
                __CLR4_4_1s17s17lc8axesm.R.inc(36389);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1s17s17lc8axesm.R.inc(36390);fail(e.getMessage());
            }
        }

        }__CLR4_4_1s17s17lc8axesm.R.inc(36391);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}
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
        super("testChronology");__CLR4_4_1s17s17lc8axesm.R.inc(36393);try{__CLR4_4_1s17s17lc8axesm.R.inc(36392);
        __CLR4_4_1s17s17lc8axesm.R.inc(36394);iIterations = iterations;
        __CLR4_4_1s17s17lc8axesm.R.inc(36395);iMode = mode;
        __CLR4_4_1s17s17lc8axesm.R.inc(36396);iSeed = seed;
        __CLR4_4_1s17s17lc8axesm.R.inc(36397);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36398)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36399)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36400);iTest = new TestGregorianChronology();
            __CLR4_4_1s17s17lc8axesm.R.inc(36401);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36402);iTest = new TestJulianChronology();
            __CLR4_4_1s17s17lc8axesm.R.inc(36403);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36404);
        __CLR4_4_1s17s17lc8axesm.R.inc(36405);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36406);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36407);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36408);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36409);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36410);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36411);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1s17s17lc8axesm.R.inc(36412);
        __CLR4_4_1s17s17lc8axesm.R.inc(36413);int a, b;
        __CLR4_4_1s17s17lc8axesm.R.inc(36414);long x, y;
        __CLR4_4_1s17s17lc8axesm.R.inc(36415);boolean m, n;

        // get test
        __CLR4_4_1s17s17lc8axesm.R.inc(36416);a = fieldA.get(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36417);b = fieldB.get(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36418);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1s17s17lc8axesm.R.inc(36419);Class fieldClass = fieldA.getClass();
        __CLR4_4_1s17s17lc8axesm.R.inc(36420);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36421)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36422)==0&false))) {{
            
            __CLR4_4_1s17s17lc8axesm.R.inc(36423);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1s17s17lc8axesm.R.inc(36424);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1s17s17lc8axesm.R.inc(36425);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1s17s17lc8axesm.R.inc(36426);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36427);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36428);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1s17s17lc8axesm.R.iget(36429)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36430)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36431);x = fieldA.set(millis, a);
            __CLR4_4_1s17s17lc8axesm.R.inc(36432);y = fieldB.set(millis, b);
            __CLR4_4_1s17s17lc8axesm.R.inc(36433);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1s17s17lc8axesm.R.inc(36434);x = fieldA.roundFloor(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36435);y = fieldB.roundFloor(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36436);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1s17s17lc8axesm.R.inc(36437);x = fieldA.roundCeiling(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36438);y = fieldB.roundCeiling(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36439);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1s17s17lc8axesm.R.inc(36440);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36441);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36442);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1s17s17lc8axesm.R.inc(36443);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36444);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36445);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1s17s17lc8axesm.R.inc(36446);x = fieldA.remainder(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36447);y = fieldB.remainder(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36448);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1s17s17lc8axesm.R.inc(36449);x = fieldA.add(millis, value);
        __CLR4_4_1s17s17lc8axesm.R.inc(36450);y = fieldB.add(millis, value);
        __CLR4_4_1s17s17lc8axesm.R.inc(36451);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1s17s17lc8axesm.R.inc(36452);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1s17s17lc8axesm.R.inc(36453);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1s17s17lc8axesm.R.inc(36454);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1s17s17lc8axesm.R.inc(36455);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36456);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1s17s17lc8axesm.R.inc(36457);try {
            __CLR4_4_1s17s17lc8axesm.R.inc(36458);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1s17s17lc8axesm.R.inc(36459);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1s17s17lc8axesm.R.inc(36460);throw e;
        }

        // isLeap test
        __CLR4_4_1s17s17lc8axesm.R.inc(36461);m = fieldA.isLeap(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36462);n = fieldB.isLeap(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36463);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1s17s17lc8axesm.R.inc(36464);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36465);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36466);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36467);
        __CLR4_4_1s17s17lc8axesm.R.inc(36468);if ((((minValue >= maxValue)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36469)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36470)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36471);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1s17s17lc8axesm.R.inc(36472);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1s17s17lc8axesm.R.inc(36473);value -= minValue;

        __CLR4_4_1s17s17lc8axesm.R.inc(36474);if ((((value >= 0)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36475)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36476)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36477);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1s17s17lc8axesm.R.inc(36478);int remByRange = (-value) % wrapRange;

        __CLR4_4_1s17s17lc8axesm.R.inc(36479);if ((((remByRange == 0)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36480)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36481)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36482);return 0 + minValue;
        }
        }__CLR4_4_1s17s17lc8axesm.R.inc(36483);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36484);
        __CLR4_4_1s17s17lc8axesm.R.inc(36485);if ((((valueA != valueB)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36486)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36487)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36488);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36489);
        __CLR4_4_1s17s17lc8axesm.R.inc(36490);if ((((millisA != millisB)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36491)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36492)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36493);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36494);
        __CLR4_4_1s17s17lc8axesm.R.inc(36495);if ((((millisA != millisB)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36496)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36497)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36498);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36499);
        __CLR4_4_1s17s17lc8axesm.R.inc(36500);if ((((boolA != boolB)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36501)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36502)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36503);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36504);
        __CLR4_4_1s17s17lc8axesm.R.inc(36505);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1s17s17lc8axesm.R.inc(36506);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1s17s17lc8axesm.R.inc(36507);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36508);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36509);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1s17s17lc8axesm.R.inc(36510);throw new RuntimeException();
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36511);
        __CLR4_4_1s17s17lc8axesm.R.inc(36512);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1s17s17lc8axesm.R.inc(36513);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1s17s17lc8axesm.R.inc(36514);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36515);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36516);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36517);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1s17s17lc8axesm.R.inc(36518);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36519);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36520);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1s17s17lc8axesm.R.inc(36521);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1s17s17lc8axesm.R.inc(36522);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36523);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36524);throw new RuntimeException();
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36525);
        __CLR4_4_1s17s17lc8axesm.R.inc(36526);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1s17s17lc8axesm.R.inc(36527);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1s17s17lc8axesm.R.inc(36528);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36529);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36530);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36531);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1s17s17lc8axesm.R.inc(36532);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36533);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36534);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1s17s17lc8axesm.R.inc(36535);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1s17s17lc8axesm.R.inc(36536);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36537);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1s17s17lc8axesm.R.inc(36538);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1s17s17lc8axesm.R.inc(36539);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1s17s17lc8axesm.R.inc(36540);throw new RuntimeException();
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36541);
        __CLR4_4_1s17s17lc8axesm.R.inc(36542);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1s17s17lc8axesm.R.inc(36543);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1s17s17lc8axesm.R.inc(36544);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36545);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1s17s17lc8axesm.R.inc(36546);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1s17s17lc8axesm.R.inc(36547);throw new RuntimeException();
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36548);
        __CLR4_4_1s17s17lc8axesm.R.inc(36549);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1s17s17lc8axesm.R.iget(36550)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36551)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36552);return fieldA.getName();
        } }else {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36553);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36554);
        __CLR4_4_1s17s17lc8axesm.R.inc(36555);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36556);
        __CLR4_4_1s17s17lc8axesm.R.inc(36557);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36558);
        __CLR4_4_1s17s17lc8axesm.R.inc(36559);return makeDate(millis, iActual);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36560);
        __CLR4_4_1s17s17lc8axesm.R.inc(36561);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36562);
        __CLR4_4_1s17s17lc8axesm.R.inc(36563);long millis = rnd.nextLong();
        __CLR4_4_1s17s17lc8axesm.R.inc(36564);if ((((millis >= 0)&&(__CLR4_4_1s17s17lc8axesm.R.iget(36565)!=0|true))||(__CLR4_4_1s17s17lc8axesm.R.iget(36566)==0&false))) {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36567);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1s17s17lc8axesm.R.inc(36568);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1s17s17lc8axesm.R.inc(36569);return millis;
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1s17s17lc8axesm.R.inc(36570);
        __CLR4_4_1s17s17lc8axesm.R.inc(36571);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36572);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36573);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36574);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36575);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36576);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1s17s17lc8axesm.R.inc(36577);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1s17s17lc8axesm.R.flushNeeded();}}

}
