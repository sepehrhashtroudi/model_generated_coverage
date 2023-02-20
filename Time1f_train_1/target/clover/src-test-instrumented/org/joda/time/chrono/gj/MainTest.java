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
public class MainTest extends TestCase {static class __CLR4_4_1qimqimle6qeag4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,34613,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1qimqimle6qeag4.R.inc(34366);
        __CLR4_4_1qimqimle6qeag4.R.inc(34367);int iterations = 1000000;
        __CLR4_4_1qimqimle6qeag4.R.inc(34368);int mode = GREGORIAN_MODE;
        __CLR4_4_1qimqimle6qeag4.R.inc(34369);long seed = 1345435247779935L;

        __CLR4_4_1qimqimle6qeag4.R.inc(34370);if ((((args.length > 0)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34371)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34372)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34373);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1qimqimle6qeag4.R.inc(34374);if ((((args.length > 1)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34375)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34376)==0&false))) {{
                __CLR4_4_1qimqimle6qeag4.R.inc(34377);if ((((args[1].startsWith("g"))&&(__CLR4_4_1qimqimle6qeag4.R.iget(34378)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34379)==0&false))) {{
                    __CLR4_4_1qimqimle6qeag4.R.inc(34380);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1qimqimle6qeag4.R.inc(34381);if ((((args[1].startsWith("j"))&&(__CLR4_4_1qimqimle6qeag4.R.iget(34382)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34383)==0&false))) {{
                    __CLR4_4_1qimqimle6qeag4.R.inc(34384);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1qimqimle6qeag4.R.inc(34385);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1qimqimle6qeag4.R.inc(34386);if ((((args.length > 2)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34387)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34388)==0&false))) {{
                    __CLR4_4_1qimqimle6qeag4.R.inc(34389);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1qimqimle6qeag4.R.inc(34390);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}
    public void testChronology() {__CLR4_4_1qimqimle6qeag4.R.globalSliceStart(getClass().getName(),34391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nqjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qimqimle6qeag4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qimqimle6qeag4.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nqjb(){try{__CLR4_4_1qimqimle6qeag4.R.inc(34391);
        __CLR4_4_1qimqimle6qeag4.R.inc(34392);int iterations = iIterations;
        __CLR4_4_1qimqimle6qeag4.R.inc(34393);long seed = iSeed;
        __CLR4_4_1qimqimle6qeag4.R.inc(34394);String modeStr;
        __CLR4_4_1qimqimle6qeag4.R.inc(34395);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34396)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34397)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34398);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34399);modeStr = "Julian";
        }

        }__CLR4_4_1qimqimle6qeag4.R.inc(34400);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1qimqimle6qeag4.R.inc(34401);Random rnd = new Random(seed);
        __CLR4_4_1qimqimle6qeag4.R.inc(34402);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1qimqimle6qeag4.R.inc(34403);for (int i=0; (((i<iterations)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34404)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34405)==0&false)); i++) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34406);long now = System.currentTimeMillis();
            __CLR4_4_1qimqimle6qeag4.R.inc(34407);if ((((now >= updateMillis)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34408)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34409)==0&false))) {{
                __CLR4_4_1qimqimle6qeag4.R.inc(34410);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1qimqimle6qeag4.R.inc(34411);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1qimqimle6qeag4.R.inc(34412);if ((((complete < 100)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34413)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34414)==0&false))) {{
                    __CLR4_4_1qimqimle6qeag4.R.inc(34415);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1qimqimle6qeag4.R.inc(34416);long millis = randomMillis(rnd);
            __CLR4_4_1qimqimle6qeag4.R.inc(34417);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1qimqimle6qeag4.R.inc(34418);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1qimqimle6qeag4.R.inc(34419);try {
                __CLR4_4_1qimqimle6qeag4.R.inc(34420);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1qimqimle6qeag4.R.inc(34421);System.out.println("Failure index: " + i);
                __CLR4_4_1qimqimle6qeag4.R.inc(34422);System.out.println("Test millis: " + millis);
                __CLR4_4_1qimqimle6qeag4.R.inc(34423);System.out.println("Test value: " + value);
                __CLR4_4_1qimqimle6qeag4.R.inc(34424);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1qimqimle6qeag4.R.inc(34425);fail(e.getMessage());
            }
        }

        }__CLR4_4_1qimqimle6qeag4.R.inc(34426);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

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
        super("testChronology");__CLR4_4_1qimqimle6qeag4.R.inc(34428);try{__CLR4_4_1qimqimle6qeag4.R.inc(34427);
        __CLR4_4_1qimqimle6qeag4.R.inc(34429);iIterations = iterations;
        __CLR4_4_1qimqimle6qeag4.R.inc(34430);iMode = mode;
        __CLR4_4_1qimqimle6qeag4.R.inc(34431);iSeed = seed;
        __CLR4_4_1qimqimle6qeag4.R.inc(34432);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34433)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34434)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34435);iTest = new TestGregorianChronology();
            __CLR4_4_1qimqimle6qeag4.R.inc(34436);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34437);iTest = new TestJulianChronology();
            __CLR4_4_1qimqimle6qeag4.R.inc(34438);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34439);
        __CLR4_4_1qimqimle6qeag4.R.inc(34440);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34441);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34442);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34443);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34444);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34445);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34446);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1qimqimle6qeag4.R.inc(34447);
        __CLR4_4_1qimqimle6qeag4.R.inc(34448);int a, b;
        __CLR4_4_1qimqimle6qeag4.R.inc(34449);long x, y;
        __CLR4_4_1qimqimle6qeag4.R.inc(34450);boolean m, n;

        // get test
        __CLR4_4_1qimqimle6qeag4.R.inc(34451);a = fieldA.get(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34452);b = fieldB.get(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34453);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1qimqimle6qeag4.R.inc(34454);Class fieldClass = fieldA.getClass();
        __CLR4_4_1qimqimle6qeag4.R.inc(34455);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34456)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34457)==0&false))) {{
            
            __CLR4_4_1qimqimle6qeag4.R.inc(34458);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1qimqimle6qeag4.R.inc(34459);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1qimqimle6qeag4.R.inc(34460);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1qimqimle6qeag4.R.inc(34461);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34462);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34463);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1qimqimle6qeag4.R.iget(34464)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34465)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34466);x = fieldA.set(millis, a);
            __CLR4_4_1qimqimle6qeag4.R.inc(34467);y = fieldB.set(millis, b);
            __CLR4_4_1qimqimle6qeag4.R.inc(34468);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1qimqimle6qeag4.R.inc(34469);x = fieldA.roundFloor(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34470);y = fieldB.roundFloor(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34471);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1qimqimle6qeag4.R.inc(34472);x = fieldA.roundCeiling(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34473);y = fieldB.roundCeiling(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34474);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1qimqimle6qeag4.R.inc(34475);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34476);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34477);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1qimqimle6qeag4.R.inc(34478);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34479);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34480);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1qimqimle6qeag4.R.inc(34481);x = fieldA.remainder(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34482);y = fieldB.remainder(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34483);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1qimqimle6qeag4.R.inc(34484);x = fieldA.add(millis, value);
        __CLR4_4_1qimqimle6qeag4.R.inc(34485);y = fieldB.add(millis, value);
        __CLR4_4_1qimqimle6qeag4.R.inc(34486);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1qimqimle6qeag4.R.inc(34487);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1qimqimle6qeag4.R.inc(34488);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1qimqimle6qeag4.R.inc(34489);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1qimqimle6qeag4.R.inc(34490);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34491);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1qimqimle6qeag4.R.inc(34492);try {
            __CLR4_4_1qimqimle6qeag4.R.inc(34493);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1qimqimle6qeag4.R.inc(34494);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1qimqimle6qeag4.R.inc(34495);throw e;
        }

        // isLeap test
        __CLR4_4_1qimqimle6qeag4.R.inc(34496);m = fieldA.isLeap(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34497);n = fieldB.isLeap(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34498);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1qimqimle6qeag4.R.inc(34499);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34500);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34501);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34502);
        __CLR4_4_1qimqimle6qeag4.R.inc(34503);if ((((minValue >= maxValue)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34504)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34505)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34506);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1qimqimle6qeag4.R.inc(34507);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1qimqimle6qeag4.R.inc(34508);value -= minValue;

        __CLR4_4_1qimqimle6qeag4.R.inc(34509);if ((((value >= 0)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34510)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34511)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34512);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1qimqimle6qeag4.R.inc(34513);int remByRange = (-value) % wrapRange;

        __CLR4_4_1qimqimle6qeag4.R.inc(34514);if ((((remByRange == 0)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34515)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34516)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34517);return 0 + minValue;
        }
        }__CLR4_4_1qimqimle6qeag4.R.inc(34518);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34519);
        __CLR4_4_1qimqimle6qeag4.R.inc(34520);if ((((valueA != valueB)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34521)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34522)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34523);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34524);
        __CLR4_4_1qimqimle6qeag4.R.inc(34525);if ((((millisA != millisB)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34526)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34527)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34528);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34529);
        __CLR4_4_1qimqimle6qeag4.R.inc(34530);if ((((millisA != millisB)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34531)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34532)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34533);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34534);
        __CLR4_4_1qimqimle6qeag4.R.inc(34535);if ((((boolA != boolB)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34536)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34537)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34538);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34539);
        __CLR4_4_1qimqimle6qeag4.R.inc(34540);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qimqimle6qeag4.R.inc(34541);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qimqimle6qeag4.R.inc(34542);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34543);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34544);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1qimqimle6qeag4.R.inc(34545);throw new RuntimeException();
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34546);
        __CLR4_4_1qimqimle6qeag4.R.inc(34547);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qimqimle6qeag4.R.inc(34548);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qimqimle6qeag4.R.inc(34549);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34550);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34551);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34552);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1qimqimle6qeag4.R.inc(34553);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34554);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34555);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1qimqimle6qeag4.R.inc(34556);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1qimqimle6qeag4.R.inc(34557);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34558);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34559);throw new RuntimeException();
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34560);
        __CLR4_4_1qimqimle6qeag4.R.inc(34561);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qimqimle6qeag4.R.inc(34562);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qimqimle6qeag4.R.inc(34563);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34564);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34565);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34566);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1qimqimle6qeag4.R.inc(34567);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34568);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34569);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1qimqimle6qeag4.R.inc(34570);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1qimqimle6qeag4.R.inc(34571);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34572);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1qimqimle6qeag4.R.inc(34573);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1qimqimle6qeag4.R.inc(34574);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1qimqimle6qeag4.R.inc(34575);throw new RuntimeException();
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34576);
        __CLR4_4_1qimqimle6qeag4.R.inc(34577);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qimqimle6qeag4.R.inc(34578);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qimqimle6qeag4.R.inc(34579);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34580);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qimqimle6qeag4.R.inc(34581);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1qimqimle6qeag4.R.inc(34582);throw new RuntimeException();
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34583);
        __CLR4_4_1qimqimle6qeag4.R.inc(34584);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1qimqimle6qeag4.R.iget(34585)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34586)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34587);return fieldA.getName();
        } }else {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34588);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34589);
        __CLR4_4_1qimqimle6qeag4.R.inc(34590);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34591);
        __CLR4_4_1qimqimle6qeag4.R.inc(34592);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34593);
        __CLR4_4_1qimqimle6qeag4.R.inc(34594);return makeDate(millis, iActual);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34595);
        __CLR4_4_1qimqimle6qeag4.R.inc(34596);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34597);
        __CLR4_4_1qimqimle6qeag4.R.inc(34598);long millis = rnd.nextLong();
        __CLR4_4_1qimqimle6qeag4.R.inc(34599);if ((((millis >= 0)&&(__CLR4_4_1qimqimle6qeag4.R.iget(34600)!=0|true))||(__CLR4_4_1qimqimle6qeag4.R.iget(34601)==0&false))) {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34602);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1qimqimle6qeag4.R.inc(34603);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1qimqimle6qeag4.R.inc(34604);return millis;
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1qimqimle6qeag4.R.inc(34605);
        __CLR4_4_1qimqimle6qeag4.R.inc(34606);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34607);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34608);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34609);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34610);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34611);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1qimqimle6qeag4.R.inc(34612);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1qimqimle6qeag4.R.flushNeeded();}}

}
