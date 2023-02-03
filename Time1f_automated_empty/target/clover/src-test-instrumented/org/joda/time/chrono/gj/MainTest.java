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
public class MainTest extends TestCase {static class __CLR4_4_1ibjibjldnipz8z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,23954,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23743);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23744);int iterations = 1000000;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23745);int mode = GREGORIAN_MODE;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23746);long seed = 1345435247779935L;

        __CLR4_4_1ibjibjldnipz8z.R.inc(23747);if ((((args.length > 0)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23748)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23749)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23750);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1ibjibjldnipz8z.R.inc(23751);if ((((args.length > 1)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23752)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23753)==0&false))) {{
                __CLR4_4_1ibjibjldnipz8z.R.inc(23754);if ((((args[1].startsWith("g"))&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23755)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23756)==0&false))) {{
                    __CLR4_4_1ibjibjldnipz8z.R.inc(23757);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1ibjibjldnipz8z.R.inc(23758);if ((((args[1].startsWith("j"))&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23759)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23760)==0&false))) {{
                    __CLR4_4_1ibjibjldnipz8z.R.inc(23761);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1ibjibjldnipz8z.R.inc(23762);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1ibjibjldnipz8z.R.inc(23763);if ((((args.length > 2)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23764)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23765)==0&false))) {{
                    __CLR4_4_1ibjibjldnipz8z.R.inc(23766);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1ibjibjldnipz8z.R.inc(23767);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

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
        super("testChronology");__CLR4_4_1ibjibjldnipz8z.R.inc(23769);try{__CLR4_4_1ibjibjldnipz8z.R.inc(23768);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23770);iIterations = iterations;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23771);iMode = mode;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23772);iSeed = seed;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23773);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23774)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23775)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23776);iTest = new TestGregorianChronology();
            __CLR4_4_1ibjibjldnipz8z.R.inc(23777);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23778);iTest = new TestJulianChronology();
            __CLR4_4_1ibjibjldnipz8z.R.inc(23779);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23780);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23781);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23782);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23783);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23784);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23785);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23786);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23787);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23788);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23789);int a, b;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23790);long x, y;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23791);boolean m, n;

        // get test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23792);a = fieldA.get(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23793);b = fieldB.get(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23794);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1ibjibjldnipz8z.R.inc(23795);Class fieldClass = fieldA.getClass();
        __CLR4_4_1ibjibjldnipz8z.R.inc(23796);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23797)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23798)==0&false))) {{
            
            __CLR4_4_1ibjibjldnipz8z.R.inc(23799);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1ibjibjldnipz8z.R.inc(23800);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1ibjibjldnipz8z.R.inc(23801);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1ibjibjldnipz8z.R.inc(23802);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23803);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23804);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23805)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23806)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23807);x = fieldA.set(millis, a);
            __CLR4_4_1ibjibjldnipz8z.R.inc(23808);y = fieldB.set(millis, b);
            __CLR4_4_1ibjibjldnipz8z.R.inc(23809);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1ibjibjldnipz8z.R.inc(23810);x = fieldA.roundFloor(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23811);y = fieldB.roundFloor(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23812);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23813);x = fieldA.roundCeiling(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23814);y = fieldB.roundCeiling(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23815);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23816);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23817);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23818);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23819);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23820);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23821);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23822);x = fieldA.remainder(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23823);y = fieldB.remainder(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23824);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23825);x = fieldA.add(millis, value);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23826);y = fieldB.add(millis, value);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23827);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23828);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23829);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23830);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23831);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23832);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23833);try {
            __CLR4_4_1ibjibjldnipz8z.R.inc(23834);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1ibjibjldnipz8z.R.inc(23835);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1ibjibjldnipz8z.R.inc(23836);throw e;
        }

        // isLeap test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23837);m = fieldA.isLeap(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23838);n = fieldB.isLeap(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23839);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1ibjibjldnipz8z.R.inc(23840);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23841);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23842);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23843);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23844);if ((((minValue >= maxValue)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23845)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23846)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23847);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1ibjibjldnipz8z.R.inc(23848);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1ibjibjldnipz8z.R.inc(23849);value -= minValue;

        __CLR4_4_1ibjibjldnipz8z.R.inc(23850);if ((((value >= 0)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23851)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23852)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23853);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1ibjibjldnipz8z.R.inc(23854);int remByRange = (-value) % wrapRange;

        __CLR4_4_1ibjibjldnipz8z.R.inc(23855);if ((((remByRange == 0)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23856)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23857)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23858);return 0 + minValue;
        }
        }__CLR4_4_1ibjibjldnipz8z.R.inc(23859);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23860);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23861);if ((((valueA != valueB)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23862)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23863)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23864);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23865);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23866);if ((((millisA != millisB)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23867)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23868)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23869);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23870);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23871);if ((((millisA != millisB)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23872)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23873)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23874);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23875);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23876);if ((((boolA != boolB)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23877)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23878)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23879);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23880);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23881);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23882);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1ibjibjldnipz8z.R.inc(23883);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23884);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23885);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23886);throw new RuntimeException();
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23887);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23888);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23889);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1ibjibjldnipz8z.R.inc(23890);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23891);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23892);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23893);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23894);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23895);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23896);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23897);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23898);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23899);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23900);throw new RuntimeException();
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23901);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23902);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23903);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1ibjibjldnipz8z.R.inc(23904);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23905);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23906);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23907);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23908);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23909);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23910);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23911);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23912);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23913);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23914);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23915);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23916);throw new RuntimeException();
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23917);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23918);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23919);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1ibjibjldnipz8z.R.inc(23920);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23921);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23922);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23923);throw new RuntimeException();
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23924);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23925);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23926)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23927)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23928);return fieldA.getName();
        } }else {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23929);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23930);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23931);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23932);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23933);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23934);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23935);return makeDate(millis, iActual);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23936);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23937);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23938);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23939);long millis = rnd.nextLong();
        __CLR4_4_1ibjibjldnipz8z.R.inc(23940);if ((((millis >= 0)&&(__CLR4_4_1ibjibjldnipz8z.R.iget(23941)!=0|true))||(__CLR4_4_1ibjibjldnipz8z.R.iget(23942)==0&false))) {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23943);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1ibjibjldnipz8z.R.inc(23944);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1ibjibjldnipz8z.R.inc(23945);return millis;
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1ibjibjldnipz8z.R.inc(23946);
        __CLR4_4_1ibjibjldnipz8z.R.inc(23947);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23948);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23949);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23950);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23951);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23952);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1ibjibjldnipz8z.R.inc(23953);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1ibjibjldnipz8z.R.flushNeeded();}}

}
