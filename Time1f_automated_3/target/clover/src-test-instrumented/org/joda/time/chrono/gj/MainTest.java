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
public class MainTest extends TestCase {static class __CLR4_4_1khakhale6np4q1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,26789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1khakhale6np4q1.R.inc(26542);
        __CLR4_4_1khakhale6np4q1.R.inc(26543);int iterations = 1000000;
        __CLR4_4_1khakhale6np4q1.R.inc(26544);int mode = GREGORIAN_MODE;
        __CLR4_4_1khakhale6np4q1.R.inc(26545);long seed = 1345435247779935L;

        __CLR4_4_1khakhale6np4q1.R.inc(26546);if ((((args.length > 0)&&(__CLR4_4_1khakhale6np4q1.R.iget(26547)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26548)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26549);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1khakhale6np4q1.R.inc(26550);if ((((args.length > 1)&&(__CLR4_4_1khakhale6np4q1.R.iget(26551)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26552)==0&false))) {{
                __CLR4_4_1khakhale6np4q1.R.inc(26553);if ((((args[1].startsWith("g"))&&(__CLR4_4_1khakhale6np4q1.R.iget(26554)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26555)==0&false))) {{
                    __CLR4_4_1khakhale6np4q1.R.inc(26556);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1khakhale6np4q1.R.inc(26557);if ((((args[1].startsWith("j"))&&(__CLR4_4_1khakhale6np4q1.R.iget(26558)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26559)==0&false))) {{
                    __CLR4_4_1khakhale6np4q1.R.inc(26560);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1khakhale6np4q1.R.inc(26561);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1khakhale6np4q1.R.inc(26562);if ((((args.length > 2)&&(__CLR4_4_1khakhale6np4q1.R.iget(26563)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26564)==0&false))) {{
                    __CLR4_4_1khakhale6np4q1.R.inc(26565);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1khakhale6np4q1.R.inc(26566);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}
    public void testChronology() {__CLR4_4_1khakhale6np4q1.R.globalSliceStart(getClass().getName(),26567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nkhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khakhale6np4q1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khakhale6np4q1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nkhz(){try{__CLR4_4_1khakhale6np4q1.R.inc(26567);
        __CLR4_4_1khakhale6np4q1.R.inc(26568);int iterations = iIterations;
        __CLR4_4_1khakhale6np4q1.R.inc(26569);long seed = iSeed;
        __CLR4_4_1khakhale6np4q1.R.inc(26570);String modeStr;
        __CLR4_4_1khakhale6np4q1.R.inc(26571);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1khakhale6np4q1.R.iget(26572)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26573)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26574);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1khakhale6np4q1.R.inc(26575);modeStr = "Julian";
        }

        }__CLR4_4_1khakhale6np4q1.R.inc(26576);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1khakhale6np4q1.R.inc(26577);Random rnd = new Random(seed);
        __CLR4_4_1khakhale6np4q1.R.inc(26578);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1khakhale6np4q1.R.inc(26579);for (int i=0; (((i<iterations)&&(__CLR4_4_1khakhale6np4q1.R.iget(26580)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26581)==0&false)); i++) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26582);long now = System.currentTimeMillis();
            __CLR4_4_1khakhale6np4q1.R.inc(26583);if ((((now >= updateMillis)&&(__CLR4_4_1khakhale6np4q1.R.iget(26584)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26585)==0&false))) {{
                __CLR4_4_1khakhale6np4q1.R.inc(26586);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1khakhale6np4q1.R.inc(26587);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1khakhale6np4q1.R.inc(26588);if ((((complete < 100)&&(__CLR4_4_1khakhale6np4q1.R.iget(26589)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26590)==0&false))) {{
                    __CLR4_4_1khakhale6np4q1.R.inc(26591);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1khakhale6np4q1.R.inc(26592);long millis = randomMillis(rnd);
            __CLR4_4_1khakhale6np4q1.R.inc(26593);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1khakhale6np4q1.R.inc(26594);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1khakhale6np4q1.R.inc(26595);try {
                __CLR4_4_1khakhale6np4q1.R.inc(26596);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1khakhale6np4q1.R.inc(26597);System.out.println("Failure index: " + i);
                __CLR4_4_1khakhale6np4q1.R.inc(26598);System.out.println("Test millis: " + millis);
                __CLR4_4_1khakhale6np4q1.R.inc(26599);System.out.println("Test value: " + value);
                __CLR4_4_1khakhale6np4q1.R.inc(26600);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1khakhale6np4q1.R.inc(26601);fail(e.getMessage());
            }
        }

        }__CLR4_4_1khakhale6np4q1.R.inc(26602);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}
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
        super("testChronology");__CLR4_4_1khakhale6np4q1.R.inc(26604);try{__CLR4_4_1khakhale6np4q1.R.inc(26603);
        __CLR4_4_1khakhale6np4q1.R.inc(26605);iIterations = iterations;
        __CLR4_4_1khakhale6np4q1.R.inc(26606);iMode = mode;
        __CLR4_4_1khakhale6np4q1.R.inc(26607);iSeed = seed;
        __CLR4_4_1khakhale6np4q1.R.inc(26608);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1khakhale6np4q1.R.iget(26609)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26610)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26611);iTest = new TestGregorianChronology();
            __CLR4_4_1khakhale6np4q1.R.inc(26612);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1khakhale6np4q1.R.inc(26613);iTest = new TestJulianChronology();
            __CLR4_4_1khakhale6np4q1.R.inc(26614);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1khakhale6np4q1.R.inc(26615);
        __CLR4_4_1khakhale6np4q1.R.inc(26616);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26617);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26618);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26619);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26620);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26621);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26622);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1khakhale6np4q1.R.inc(26623);
        __CLR4_4_1khakhale6np4q1.R.inc(26624);int a, b;
        __CLR4_4_1khakhale6np4q1.R.inc(26625);long x, y;
        __CLR4_4_1khakhale6np4q1.R.inc(26626);boolean m, n;

        // get test
        __CLR4_4_1khakhale6np4q1.R.inc(26627);a = fieldA.get(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26628);b = fieldB.get(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26629);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1khakhale6np4q1.R.inc(26630);Class fieldClass = fieldA.getClass();
        __CLR4_4_1khakhale6np4q1.R.inc(26631);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1khakhale6np4q1.R.iget(26632)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26633)==0&false))) {{
            
            __CLR4_4_1khakhale6np4q1.R.inc(26634);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1khakhale6np4q1.R.inc(26635);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1khakhale6np4q1.R.inc(26636);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1khakhale6np4q1.R.inc(26637);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26638);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26639);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1khakhale6np4q1.R.iget(26640)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26641)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1khakhale6np4q1.R.inc(26642);x = fieldA.set(millis, a);
            __CLR4_4_1khakhale6np4q1.R.inc(26643);y = fieldB.set(millis, b);
            __CLR4_4_1khakhale6np4q1.R.inc(26644);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1khakhale6np4q1.R.inc(26645);x = fieldA.roundFloor(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26646);y = fieldB.roundFloor(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26647);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1khakhale6np4q1.R.inc(26648);x = fieldA.roundCeiling(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26649);y = fieldB.roundCeiling(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26650);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1khakhale6np4q1.R.inc(26651);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26652);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26653);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1khakhale6np4q1.R.inc(26654);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26655);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26656);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1khakhale6np4q1.R.inc(26657);x = fieldA.remainder(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26658);y = fieldB.remainder(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26659);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1khakhale6np4q1.R.inc(26660);x = fieldA.add(millis, value);
        __CLR4_4_1khakhale6np4q1.R.inc(26661);y = fieldB.add(millis, value);
        __CLR4_4_1khakhale6np4q1.R.inc(26662);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1khakhale6np4q1.R.inc(26663);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1khakhale6np4q1.R.inc(26664);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1khakhale6np4q1.R.inc(26665);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1khakhale6np4q1.R.inc(26666);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26667);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1khakhale6np4q1.R.inc(26668);try {
            __CLR4_4_1khakhale6np4q1.R.inc(26669);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1khakhale6np4q1.R.inc(26670);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1khakhale6np4q1.R.inc(26671);throw e;
        }

        // isLeap test
        __CLR4_4_1khakhale6np4q1.R.inc(26672);m = fieldA.isLeap(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26673);n = fieldB.isLeap(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26674);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1khakhale6np4q1.R.inc(26675);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26676);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26677);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1khakhale6np4q1.R.inc(26678);
        __CLR4_4_1khakhale6np4q1.R.inc(26679);if ((((minValue >= maxValue)&&(__CLR4_4_1khakhale6np4q1.R.iget(26680)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26681)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26682);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1khakhale6np4q1.R.inc(26683);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1khakhale6np4q1.R.inc(26684);value -= minValue;

        __CLR4_4_1khakhale6np4q1.R.inc(26685);if ((((value >= 0)&&(__CLR4_4_1khakhale6np4q1.R.iget(26686)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26687)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26688);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1khakhale6np4q1.R.inc(26689);int remByRange = (-value) % wrapRange;

        __CLR4_4_1khakhale6np4q1.R.inc(26690);if ((((remByRange == 0)&&(__CLR4_4_1khakhale6np4q1.R.iget(26691)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26692)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26693);return 0 + minValue;
        }
        }__CLR4_4_1khakhale6np4q1.R.inc(26694);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26695);
        __CLR4_4_1khakhale6np4q1.R.inc(26696);if ((((valueA != valueB)&&(__CLR4_4_1khakhale6np4q1.R.iget(26697)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26698)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26699);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26700);
        __CLR4_4_1khakhale6np4q1.R.inc(26701);if ((((millisA != millisB)&&(__CLR4_4_1khakhale6np4q1.R.iget(26702)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26703)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26704);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26705);
        __CLR4_4_1khakhale6np4q1.R.inc(26706);if ((((millisA != millisB)&&(__CLR4_4_1khakhale6np4q1.R.iget(26707)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26708)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26709);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26710);
        __CLR4_4_1khakhale6np4q1.R.inc(26711);if ((((boolA != boolB)&&(__CLR4_4_1khakhale6np4q1.R.iget(26712)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26713)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26714);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26715);
        __CLR4_4_1khakhale6np4q1.R.inc(26716);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1khakhale6np4q1.R.inc(26717);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1khakhale6np4q1.R.inc(26718);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26719);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26720);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1khakhale6np4q1.R.inc(26721);throw new RuntimeException();
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26722);
        __CLR4_4_1khakhale6np4q1.R.inc(26723);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1khakhale6np4q1.R.inc(26724);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1khakhale6np4q1.R.inc(26725);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26726);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26727);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26728);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1khakhale6np4q1.R.inc(26729);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26730);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26731);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1khakhale6np4q1.R.inc(26732);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1khakhale6np4q1.R.inc(26733);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26734);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26735);throw new RuntimeException();
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26736);
        __CLR4_4_1khakhale6np4q1.R.inc(26737);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1khakhale6np4q1.R.inc(26738);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1khakhale6np4q1.R.inc(26739);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26740);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26741);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26742);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1khakhale6np4q1.R.inc(26743);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26744);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26745);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1khakhale6np4q1.R.inc(26746);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1khakhale6np4q1.R.inc(26747);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26748);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1khakhale6np4q1.R.inc(26749);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1khakhale6np4q1.R.inc(26750);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1khakhale6np4q1.R.inc(26751);throw new RuntimeException();
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26752);
        __CLR4_4_1khakhale6np4q1.R.inc(26753);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1khakhale6np4q1.R.inc(26754);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1khakhale6np4q1.R.inc(26755);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26756);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1khakhale6np4q1.R.inc(26757);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1khakhale6np4q1.R.inc(26758);throw new RuntimeException();
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1khakhale6np4q1.R.inc(26759);
        __CLR4_4_1khakhale6np4q1.R.inc(26760);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1khakhale6np4q1.R.iget(26761)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26762)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26763);return fieldA.getName();
        } }else {{
            __CLR4_4_1khakhale6np4q1.R.inc(26764);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1khakhale6np4q1.R.inc(26765);
        __CLR4_4_1khakhale6np4q1.R.inc(26766);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1khakhale6np4q1.R.inc(26767);
        __CLR4_4_1khakhale6np4q1.R.inc(26768);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1khakhale6np4q1.R.inc(26769);
        __CLR4_4_1khakhale6np4q1.R.inc(26770);return makeDate(millis, iActual);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1khakhale6np4q1.R.inc(26771);
        __CLR4_4_1khakhale6np4q1.R.inc(26772);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1khakhale6np4q1.R.inc(26773);
        __CLR4_4_1khakhale6np4q1.R.inc(26774);long millis = rnd.nextLong();
        __CLR4_4_1khakhale6np4q1.R.inc(26775);if ((((millis >= 0)&&(__CLR4_4_1khakhale6np4q1.R.iget(26776)!=0|true))||(__CLR4_4_1khakhale6np4q1.R.iget(26777)==0&false))) {{
            __CLR4_4_1khakhale6np4q1.R.inc(26778);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1khakhale6np4q1.R.inc(26779);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1khakhale6np4q1.R.inc(26780);return millis;
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1khakhale6np4q1.R.inc(26781);
        __CLR4_4_1khakhale6np4q1.R.inc(26782);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26783);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26784);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26785);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26786);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26787);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1khakhale6np4q1.R.inc(26788);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1khakhale6np4q1.R.flushNeeded();}}

}
