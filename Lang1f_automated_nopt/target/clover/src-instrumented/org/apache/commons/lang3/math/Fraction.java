/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.math;

import java.math.BigInteger;

/**
 * <p><code>Fraction</code> is a <code>Number</code> implementation that
 * stores fractions accurately.</p>
 *
 * <p>This class is immutable, and interoperable with most methods that accept
 * a <code>Number</code>.</p>
 *
 * <p>Note that this class is intended for common use cases, it is <i>int</i>
 * based and thus suffers from various overflow issues. For a BigInteger based 
 * equivalent, please see the Commons Math BigFraction class. </p>
 *
 * @since 2.0
 * @version $Id$
 */
public final class Fraction extends Number implements Comparable<Fraction> {public static class __CLR4_4_18z88z8ldni83zq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,12080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 65382027393090L;

    /**
     * <code>Fraction</code> representation of 0.
     */
    public static final Fraction ZERO = new Fraction(0, 1);
    /**
     * <code>Fraction</code> representation of 1.
     */
    public static final Fraction ONE = new Fraction(1, 1);
    /**
     * <code>Fraction</code> representation of 1/2.
     */
    public static final Fraction ONE_HALF = new Fraction(1, 2);
    /**
     * <code>Fraction</code> representation of 1/3.
     */
    public static final Fraction ONE_THIRD = new Fraction(1, 3);
    /**
     * <code>Fraction</code> representation of 2/3.
     */
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);
    /**
     * <code>Fraction</code> representation of 1/4.
     */
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);
    /**
     * <code>Fraction</code> representation of 2/4.
     */
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);
    /**
     * <code>Fraction</code> representation of 3/4.
     */
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);
    /**
     * <code>Fraction</code> representation of 1/5.
     */
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);
    /**
     * <code>Fraction</code> representation of 2/5.
     */
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);
    /**
     * <code>Fraction</code> representation of 3/5.
     */
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);
    /**
     * <code>Fraction</code> representation of 4/5.
     */
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);


    /**
     * The numerator number part of the fraction (the three in three sevenths).
     */
    private final int numerator;
    /**
     * The denominator number part of the fraction (the seven in three sevenths).
     */
    private final int denominator;

    /**
     * Cached output hashCode (class is immutable).
     */
    private transient int hashCode = 0;
    /**
     * Cached output toString (class is immutable).
     */
    private transient String toString = null;
    /**
     * Cached output toProperString (class is immutable).
     */
    private transient String toProperString = null;

    /**
     * <p>Constructs a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     */
    private Fraction(final int numerator, final int denominator) {
        super();__CLR4_4_18z88z8ldni83zq.R.inc(11637);try{__CLR4_4_18z88z8ldni83zq.R.inc(11636);
        __CLR4_4_18z88z8ldni83zq.R.inc(11638);this.numerator = numerator;
        __CLR4_4_18z88z8ldni83zq.R.inc(11639);this.denominator = denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * or the denominator is {@code negative} and the numerator is {@code Integer#MIN_VALUE}
     */
    public static Fraction getFraction(int numerator, int denominator) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11640);
        __CLR4_4_18z88z8ldni83zq.R.inc(11641);if ((((denominator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11642)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11643)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11644);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11645);if ((((denominator < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11646)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11647)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11648);if ((((numerator==Integer.MIN_VALUE ||
                    denominator==Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11649)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11650)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11651);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_4_18z88z8ldni83zq.R.inc(11652);numerator = -numerator;
            __CLR4_4_18z88z8ldni83zq.R.inc(11653);denominator = -denominator;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11654);return new Fraction(numerator, denominator);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 3 parts
     * of a fraction X Y/Z.</p>
     *
     * <p>The negative sign must be passed in on the whole number part.</p>
     *
     * @param whole  the whole number, for example the one in 'one and three sevenths'
     * @param numerator  the numerator, for example the three in 'one and three sevenths'
     * @param denominator  the denominator, for example the seven in 'one and three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * @throws ArithmeticException if the denominator is negative
     * @throws ArithmeticException if the numerator is negative
     * @throws ArithmeticException if the resulting numerator exceeds 
     *  <code>Integer.MAX_VALUE</code>
     */
    public static Fraction getFraction(final int whole, final int numerator, final int denominator) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11655);
        __CLR4_4_18z88z8ldni83zq.R.inc(11656);if ((((denominator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11657)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11658)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11659);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11660);if ((((denominator < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11661)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11662)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11663);throw new ArithmeticException("The denominator must not be negative");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11664);if ((((numerator < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11665)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11666)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11667);throw new ArithmeticException("The numerator must not be negative");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11668);long numeratorValue;
        __CLR4_4_18z88z8ldni83zq.R.inc(11669);if ((((whole < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11670)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11671)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11672);numeratorValue = whole * (long)denominator - numerator;
        } }else {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11673);numeratorValue = whole * (long)denominator + numerator;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11674);if ((((numeratorValue < Integer.MIN_VALUE ||
                numeratorValue > Integer.MAX_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11675)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11676)==0&false)))  {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11677);throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11678);return new Fraction((int) numeratorValue, denominator);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Creates a reduced <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>For example, if the input parameters represent 2/4, then the created
     * fraction will be 1/2.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance, with the numerator and denominator reduced
     * @throws ArithmeticException if the denominator is <code>zero</code>
     */
    public static Fraction getReducedFraction(int numerator, int denominator) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11679);
        __CLR4_4_18z88z8ldni83zq.R.inc(11680);if ((((denominator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11681)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11682)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11683);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11684);if ((((numerator==0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11685)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11686)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11687);return ZERO; // normalize zero.
        }
        // allow 2^k/-2^31 as a valid fraction (where k>0)
        }__CLR4_4_18z88z8ldni83zq.R.inc(11688);if ((((denominator==Integer.MIN_VALUE && (numerator&1)==0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11689)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11690)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11691);numerator/=2; __CLR4_4_18z88z8ldni83zq.R.inc(11692);denominator/=2;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11693);if ((((denominator < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11694)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11695)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11696);if ((((numerator==Integer.MIN_VALUE ||
                    denominator==Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11697)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11698)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11699);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_4_18z88z8ldni83zq.R.inc(11700);numerator = -numerator;
            __CLR4_4_18z88z8ldni83zq.R.inc(11701);denominator = -denominator;
        }
        // simplify fraction.
        }__CLR4_4_18z88z8ldni83zq.R.inc(11702);final int gcd = greatestCommonDivisor(numerator, denominator);
        __CLR4_4_18z88z8ldni83zq.R.inc(11703);numerator /= gcd;
        __CLR4_4_18z88z8ldni83zq.R.inc(11704);denominator /= gcd;
        __CLR4_4_18z88z8ldni83zq.R.inc(11705);return new Fraction(numerator, denominator);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance from a <code>double</code> value.</p>
     *
     * <p>This method uses the <a href="http://archives.math.utk.edu/articles/atuyl/confrac/">
     *  continued fraction algorithm</a>, computing a maximum of
     *  25 convergents and bounding the denominator by 10,000.</p>
     *
     * @param value  the double value to convert
     * @return a new fraction instance that is close to the value
     * @throws ArithmeticException if <code>|value| > Integer.MAX_VALUE</code> 
     *  or <code>value = NaN</code>
     * @throws ArithmeticException if the calculated denominator is <code>zero</code>
     * @throws ArithmeticException if the the algorithm does not converge
     */
    public static Fraction getFraction(double value) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11706);
        __CLR4_4_18z88z8ldni83zq.R.inc(11707);final int sign = (((value < 0 )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11708)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11709)==0&false))? -1 : 1;
        __CLR4_4_18z88z8ldni83zq.R.inc(11710);value = Math.abs(value);
        __CLR4_4_18z88z8ldni83zq.R.inc(11711);if ((((value  > Integer.MAX_VALUE || Double.isNaN(value))&&(__CLR4_4_18z88z8ldni83zq.R.iget(11712)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11713)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11714);throw new ArithmeticException
                ("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11715);final int wholeNumber = (int) value;
        __CLR4_4_18z88z8ldni83zq.R.inc(11716);value -= wholeNumber;
        
        __CLR4_4_18z88z8ldni83zq.R.inc(11717);int numer0 = 0;  // the pre-previous
        __CLR4_4_18z88z8ldni83zq.R.inc(11718);int denom0 = 1;  // the pre-previous
        __CLR4_4_18z88z8ldni83zq.R.inc(11719);int numer1 = 1;  // the previous
        __CLR4_4_18z88z8ldni83zq.R.inc(11720);int denom1 = 0;  // the previous
        __CLR4_4_18z88z8ldni83zq.R.inc(11721);int numer2 = 0;  // the current, setup in calculation
        __CLR4_4_18z88z8ldni83zq.R.inc(11722);int denom2 = 0;  // the current, setup in calculation
        __CLR4_4_18z88z8ldni83zq.R.inc(11723);int a1 = (int) value;
        __CLR4_4_18z88z8ldni83zq.R.inc(11724);int a2 = 0;
        __CLR4_4_18z88z8ldni83zq.R.inc(11725);double x1 = 1;
        __CLR4_4_18z88z8ldni83zq.R.inc(11726);double x2 = 0;
        __CLR4_4_18z88z8ldni83zq.R.inc(11727);double y1 = value - a1;
        __CLR4_4_18z88z8ldni83zq.R.inc(11728);double y2 = 0;
        __CLR4_4_18z88z8ldni83zq.R.inc(11729);double delta1, delta2 = Double.MAX_VALUE;
        __CLR4_4_18z88z8ldni83zq.R.inc(11730);double fraction;
        __CLR4_4_18z88z8ldni83zq.R.inc(11731);int i = 1;
//        System.out.println("---");
        __CLR4_4_18z88z8ldni83zq.R.inc(11732);do {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11733);delta1 = delta2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11734);a2 = (int) (x1 / y1);
            __CLR4_4_18z88z8ldni83zq.R.inc(11735);x2 = y1;
            __CLR4_4_18z88z8ldni83zq.R.inc(11736);y2 = x1 - a2 * y1;
            __CLR4_4_18z88z8ldni83zq.R.inc(11737);numer2 = a1 * numer1 + numer0;
            __CLR4_4_18z88z8ldni83zq.R.inc(11738);denom2 = a1 * denom1 + denom0;
            __CLR4_4_18z88z8ldni83zq.R.inc(11739);fraction = (double) numer2 / (double) denom2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11740);delta2 = Math.abs(value - fraction);
//            System.out.println(numer2 + " " + denom2 + " " + fraction + " " + delta2 + " " + y1);
            __CLR4_4_18z88z8ldni83zq.R.inc(11741);a1 = a2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11742);x1 = x2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11743);y1 = y2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11744);numer0 = numer1;
            __CLR4_4_18z88z8ldni83zq.R.inc(11745);denom0 = denom1;
            __CLR4_4_18z88z8ldni83zq.R.inc(11746);numer1 = numer2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11747);denom1 = denom2;
            __CLR4_4_18z88z8ldni83zq.R.inc(11748);i++;
//            System.out.println(">>" + delta1 +" "+ delta2+" "+(delta1 > delta2)+" "+i+" "+denom2);
        } }while ((((delta1 > delta2 && denom2 <= 10000 && denom2 > 0 && i < 25)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11749)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11750)==0&false)));
        __CLR4_4_18z88z8ldni83zq.R.inc(11751);if ((((i == 25)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11752)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11753)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11754);throw new ArithmeticException("Unable to convert double to fraction");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11755);return getReducedFraction((numer0 + wholeNumber * denom0) * sign, denom0);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Creates a Fraction from a <code>String</code>.</p>
     *
     * <p>The formats accepted are:</p>
     *
     * <ol>
     *  <li><code>double</code> String containing a dot</li>
     *  <li>'X Y/Z'</li>
     *  <li>'Y/Z'</li>
     *  <li>'X' (a simple whole number)</li>
     * </ol>
     * and a .</p>
     *
     * @param str  the string to parse, must not be <code>null</code>
     * @return the new <code>Fraction</code> instance
     * @throws IllegalArgumentException if the string is <code>null</code>
     * @throws NumberFormatException if the number format is invalid
     */
    public static Fraction getFraction(String str) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11756);
        __CLR4_4_18z88z8ldni83zq.R.inc(11757);if ((((str == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11758)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11759)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11760);throw new IllegalArgumentException("The string must not be null");
        }
        // parse double format
        }__CLR4_4_18z88z8ldni83zq.R.inc(11761);int pos = str.indexOf('.');
        __CLR4_4_18z88z8ldni83zq.R.inc(11762);if ((((pos >= 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11763)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11764)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11765);return getFraction(Double.parseDouble(str));
        }

        // parse X Y/Z format
        }__CLR4_4_18z88z8ldni83zq.R.inc(11766);pos = str.indexOf(' ');
        __CLR4_4_18z88z8ldni83zq.R.inc(11767);if ((((pos > 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11768)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11769)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11770);final int whole = Integer.parseInt(str.substring(0, pos));
            __CLR4_4_18z88z8ldni83zq.R.inc(11771);str = str.substring(pos + 1);
            __CLR4_4_18z88z8ldni83zq.R.inc(11772);pos = str.indexOf('/');
            __CLR4_4_18z88z8ldni83zq.R.inc(11773);if ((((pos < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11774)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11775)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11776);throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            } }else {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11777);final int numer = Integer.parseInt(str.substring(0, pos));
                __CLR4_4_18z88z8ldni83zq.R.inc(11778);final int denom = Integer.parseInt(str.substring(pos + 1));
                __CLR4_4_18z88z8ldni83zq.R.inc(11779);return getFraction(whole, numer, denom);
            }
        }}

        // parse Y/Z format
        }__CLR4_4_18z88z8ldni83zq.R.inc(11780);pos = str.indexOf('/');
        __CLR4_4_18z88z8ldni83zq.R.inc(11781);if ((((pos < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11782)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11783)==0&false))) {{
            // simple whole number
            __CLR4_4_18z88z8ldni83zq.R.inc(11784);return getFraction(Integer.parseInt(str), 1);
        } }else {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11785);final int numer = Integer.parseInt(str.substring(0, pos));
            __CLR4_4_18z88z8ldni83zq.R.inc(11786);final int denom = Integer.parseInt(str.substring(pos + 1));
            __CLR4_4_18z88z8ldni83zq.R.inc(11787);return getFraction(numer, denom);
        }
    }}finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    // Accessors
    //-------------------------------------------------------------------

    /**
     * <p>Gets the numerator part of the fraction.</p>
     *
     * <p>This method may return a value greater than the denominator, an
     * improper fraction, such as the seven in 7/4.</p>
     *
     * @return the numerator fraction part
     */
    public int getNumerator() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11788);
        __CLR4_4_18z88z8ldni83zq.R.inc(11789);return numerator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the denominator part of the fraction.</p>
     *
     * @return the denominator fraction part
     */
    public int getDenominator() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11790);
        __CLR4_4_18z88z8ldni83zq.R.inc(11791);return denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the proper numerator, always positive.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 3 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive proper numerator, 3.</p>
     *
     * @return the numerator fraction part of a proper fraction, always positive
     */
    public int getProperNumerator() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11792);
        __CLR4_4_18z88z8ldni83zq.R.inc(11793);return Math.abs(numerator % denominator);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the proper whole part of the fraction.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 1 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive whole part -1.</p>
     *
     * @return the whole fraction part of a proper fraction, that includes the sign
     */
    public int getProperWhole() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11794);
        __CLR4_4_18z88z8ldni83zq.R.inc(11795);return numerator / denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    // Number methods
    //-------------------------------------------------------------------

    /**
     * <p>Gets the fraction as an <code>int</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public int intValue() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11796);
        __CLR4_4_18z88z8ldni83zq.R.inc(11797);return numerator / denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>long</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public long longValue() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11798);
        __CLR4_4_18z88z8ldni83zq.R.inc(11799);return (long) numerator / denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>float</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>float</code>
     */
    @Override
    public float floatValue() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11800);
        __CLR4_4_18z88z8ldni83zq.R.inc(11801);return (float) numerator / (float) denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>double</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>double</code>
     */
    @Override
    public double doubleValue() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11802);
        __CLR4_4_18z88z8ldni83zq.R.inc(11803);return (double) numerator / (double) denominator;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    // Calculations
    //-------------------------------------------------------------------

    /**
     * <p>Reduce the fraction to the smallest values for the numerator and
     * denominator, returning the result.</p>
     * 
     * <p>For example, if this fraction represents 2/4, then the result
     * will be 1/2.</p>
     *
     * @return a new reduced fraction instance, or this if no simplification possible
     */
    public Fraction reduce() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11804);
        __CLR4_4_18z88z8ldni83zq.R.inc(11805);if ((((numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11806)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11807)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11808);return (((equals(ZERO) )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11809)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11810)==0&false))? this : ZERO;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11811);final int gcd = greatestCommonDivisor(Math.abs(numerator), denominator);
        __CLR4_4_18z88z8ldni83zq.R.inc(11812);if ((((gcd == 1)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11813)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11814)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11815);return this;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11816);return Fraction.getFraction(numerator / gcd, denominator / gcd);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the inverse (1/fraction) of this one.</p>
     * 
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the numerator and denominator
     *         inverted.
     * @throws ArithmeticException if the fraction represents zero.
     */
    public Fraction invert() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11817);
        __CLR4_4_18z88z8ldni83zq.R.inc(11818);if ((((numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11819)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11820)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11821);throw new ArithmeticException("Unable to invert zero.");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11822);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11823)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11824)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11825);throw new ArithmeticException("overflow: can't negate numerator");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11826);if ((((numerator<0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11827)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11828)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11829);return new Fraction(-denominator, -numerator);
        } }else {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11830);return new Fraction(denominator, numerator);
        }
    }}finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the negative (-fraction) of this one.</p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the opposite signed numerator
     */
    public Fraction negate() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11831);
        // the positive range is one smaller than the negative range of an int.
        __CLR4_4_18z88z8ldni83zq.R.inc(11832);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11833)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11834)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11835);throw new ArithmeticException("overflow: too large to negate");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11836);return new Fraction(-numerator, denominator);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the positive equivalent of this one.</p>
     * <p>More precisely: <code>(fraction >= 0 ? this : -fraction)</code></p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return <code>this</code> if it is positive, or a new positive fraction
     *  instance with the opposite signed numerator
     */
    public Fraction abs() {try{__CLR4_4_18z88z8ldni83zq.R.inc(11837);
        __CLR4_4_18z88z8ldni83zq.R.inc(11838);if ((((numerator >= 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11839)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11840)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11841);return this;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11842);return negate();
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is raised to the passed in power.</p>
     *
     * <p>The returned fraction is in reduced form.</p>
     *
     * @param power  the power to raise the fraction to
     * @return <code>this</code> if the power is one, <code>ONE</code> if the power
     * is zero (even if the fraction equals ZERO) or a new fraction instance 
     * raised to the appropriate power
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction pow(final int power) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11843);
        __CLR4_4_18z88z8ldni83zq.R.inc(11844);if ((((power == 1)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11845)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11846)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11847);return this;
        } }else {__CLR4_4_18z88z8ldni83zq.R.inc(11848);if ((((power == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11849)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11850)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11851);return ONE;
        } }else {__CLR4_4_18z88z8ldni83zq.R.inc(11852);if ((((power < 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11853)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11854)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11855);if ((((power==Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11856)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11857)==0&false))) {{ // MIN_VALUE can't be negated.
                __CLR4_4_18z88z8ldni83zq.R.inc(11858);return this.invert().pow(2).pow(-(power/2));
            }
            }__CLR4_4_18z88z8ldni83zq.R.inc(11859);return this.invert().pow(-power);
        } }else {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11860);final Fraction f = this.multiplyBy(this);
            __CLR4_4_18z88z8ldni83zq.R.inc(11861);if ((((power % 2 == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11862)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11863)==0&false))) {{ // if even...
                __CLR4_4_18z88z8ldni83zq.R.inc(11864);return f.pow(power/2);
            } }else {{ // if odd...
                __CLR4_4_18z88z8ldni83zq.R.inc(11865);return f.pow(power/2).multiplyBy(this);
            }
        }}
    }}}}finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the greatest common divisor of the absolute value of
     * two numbers, using the "binary gcd" method which avoids
     * division and modulo operations.  See Knuth 4.5.2 algorithm B.
     * This algorithm is due to Josef Stein (1961).</p>
     *
     * @param u  a non-zero number
     * @param v  a non-zero number
     * @return the greatest common divisor, never zero
     */
    private static int greatestCommonDivisor(int u, int v) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11866);
        // From Commons Math:
        __CLR4_4_18z88z8ldni83zq.R.inc(11867);if ((((u == 0 || v == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11868)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11869)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11870);if ((((u == Integer.MIN_VALUE || v == Integer.MIN_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11871)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11872)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11873);throw new ArithmeticException("overflow: gcd is 2^31");
            }
            }__CLR4_4_18z88z8ldni83zq.R.inc(11874);return Math.abs(u) + Math.abs(v);
        }
        //if either operand is abs 1, return 1:
        }__CLR4_4_18z88z8ldni83zq.R.inc(11875);if ((((Math.abs(u) == 1 || Math.abs(v) == 1)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11876)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11877)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11878);return 1;
        }
        // keep u and v negative, as negative integers range down to
        // -2^31, while positive numbers can only be as large as 2^31-1
        // (i.e. we can't necessarily negate a negative number without
        // overflow)
        }__CLR4_4_18z88z8ldni83zq.R.inc(11879);if ((((u>0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11880)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11881)==0&false))) {{ __CLR4_4_18z88z8ldni83zq.R.inc(11882);u=-u; } // make u negative
        }__CLR4_4_18z88z8ldni83zq.R.inc(11883);if ((((v>0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11884)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11885)==0&false))) {{ __CLR4_4_18z88z8ldni83zq.R.inc(11886);v=-v; } // make v negative
        // B1. [Find power of 2]
        }__CLR4_4_18z88z8ldni83zq.R.inc(11887);int k=0;
        __CLR4_4_18z88z8ldni83zq.R.inc(11888);while (((((u&1)==0 && (v&1)==0 && k<31)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11889)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11890)==0&false))) {{ // while u and v are both even...
            __CLR4_4_18z88z8ldni83zq.R.inc(11891);u/=2; __CLR4_4_18z88z8ldni83zq.R.inc(11892);v/=2; __CLR4_4_18z88z8ldni83zq.R.inc(11893);k++; // cast out twos.
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11894);if ((((k==31)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11895)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11896)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11897);throw new ArithmeticException("overflow: gcd is 2^31");
        }
        // B2. Initialize: u and v have been divided by 2^k and at least
        //     one is odd.
        }__CLR4_4_18z88z8ldni83zq.R.inc(11898);int t = ((((u&1)==1 )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11899)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11900)==0&false))? v : -(u/2)/*B3*/;
        // t negative: u was odd, v may be even (t replaces v)
        // t positive: u was even, v is odd (t replaces u)
        __CLR4_4_18z88z8ldni83zq.R.inc(11901);do {{
            /* assert u<0 && v<0; */
            // B4/B3: cast out twos from t.
            __CLR4_4_18z88z8ldni83zq.R.inc(11902);while (((((t&1)==0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11903)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11904)==0&false))) {{ // while t is even..
                __CLR4_4_18z88z8ldni83zq.R.inc(11905);t/=2; // cast out twos
            }
            // B5 [reset max(u,v)]
            }__CLR4_4_18z88z8ldni83zq.R.inc(11906);if ((((t>0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11907)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11908)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11909);u = -t;
            } }else {{
                __CLR4_4_18z88z8ldni83zq.R.inc(11910);v = t;
            }
            // B6/B3. at this point both u and v should be odd.
            }__CLR4_4_18z88z8ldni83zq.R.inc(11911);t = (v - u)/2;
            // |u| larger: t positive (replace u)
            // |v| larger: t negative (replace v)
        } }while ((((t!=0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11912)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11913)==0&false)));
        __CLR4_4_18z88z8ldni83zq.R.inc(11914);return -u*(1<<k); // gcd is u*2^k
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    // Arithmetic
    //-------------------------------------------------------------------

    /** 
     * Multiply two integers, checking for overflow.
     * 
     * @param x a factor
     * @param y a factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     *                             an int
     */
    private static int mulAndCheck(final int x, final int y) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11915);
        __CLR4_4_18z88z8ldni83zq.R.inc(11916);final long m = (long)x*(long)y;
        __CLR4_4_18z88z8ldni83zq.R.inc(11917);if ((((m < Integer.MIN_VALUE ||
            m > Integer.MAX_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11918)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11919)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11920);throw new ArithmeticException("overflow: mul");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11921);return (int)m;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}
    
    /**
     *  Multiply two non-negative integers, checking for overflow.
     * 
     * @param x a non-negative factor
     * @param y a non-negative factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int mulPosAndCheck(final int x, final int y) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11922);
        /* assert x>=0 && y>=0; */
        __CLR4_4_18z88z8ldni83zq.R.inc(11923);final long m = (long)x*(long)y;
        __CLR4_4_18z88z8ldni83zq.R.inc(11924);if ((((m > Integer.MAX_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11925)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11926)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11927);throw new ArithmeticException("overflow: mulPos");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11928);return (int)m;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}
    
    /** 
     * Add two integers, checking for overflow.
     * 
     * @param x an addend
     * @param y an addend
     * @return the sum <code>x+y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int addAndCheck(final int x, final int y) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11929);
        __CLR4_4_18z88z8ldni83zq.R.inc(11930);final long s = (long)x+(long)y;
        __CLR4_4_18z88z8ldni83zq.R.inc(11931);if ((((s < Integer.MIN_VALUE ||
            s > Integer.MAX_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11932)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11933)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11934);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11935);return (int)s;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}
    
    /** 
     * Subtract two integers, checking for overflow.
     * 
     * @param x the minuend
     * @param y the subtrahend
     * @return the difference <code>x-y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int subAndCheck(final int x, final int y) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11936);
        __CLR4_4_18z88z8ldni83zq.R.inc(11937);final long s = (long)x-(long)y;
        __CLR4_4_18z88z8ldni83zq.R.inc(11938);if ((((s < Integer.MIN_VALUE ||
            s > Integer.MAX_VALUE)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11939)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11940)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11941);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11942);return (int)s;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}
    
    /**
     * <p>Adds the value of this fraction to another, returning the result in reduced form.
     * The algorithm follows Knuth, 4.5.1.</p>
     *
     * @param fraction  the fraction to add, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction add(final Fraction fraction) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11943);
        __CLR4_4_18z88z8ldni83zq.R.inc(11944);return addSub(fraction, true /* add */);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Subtracts the value of another fraction from the value of this one, 
     * returning the result in reduced form.</p>
     *
     * @param fraction  the fraction to subtract, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    public Fraction subtract(final Fraction fraction) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11945);
        __CLR4_4_18z88z8ldni83zq.R.inc(11946);return addSub(fraction, false /* subtract */);
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /** 
     * Implement add and subtract using algorithm described in Knuth 4.5.1.
     * 
     * @param fraction the fraction to subtract, must not be <code>null</code>
     * @param isAdd true to add, false to subtract
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    private Fraction addSub(final Fraction fraction, final boolean isAdd) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11947);
        __CLR4_4_18z88z8ldni83zq.R.inc(11948);if ((((fraction == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11949)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11950)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11951);throw new IllegalArgumentException("The fraction must not be null");
        }
        // zero is identity for addition.
        }__CLR4_4_18z88z8ldni83zq.R.inc(11952);if ((((numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11953)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11954)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11955);return (((isAdd )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11956)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11957)==0&false))? fraction : fraction.negate();
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11958);if ((((fraction.numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11959)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11960)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11961);return this;
        }     
        // if denominators are randomly distributed, d1 will be 1 about 61%
        // of the time.
        }__CLR4_4_18z88z8ldni83zq.R.inc(11962);final int d1 = greatestCommonDivisor(denominator, fraction.denominator);
        __CLR4_4_18z88z8ldni83zq.R.inc(11963);if ((((d1==1)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11964)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11965)==0&false))) {{
            // result is ( (u*v' +/- u'v) / u'v')
            __CLR4_4_18z88z8ldni83zq.R.inc(11966);final int uvp = mulAndCheck(numerator, fraction.denominator);
            __CLR4_4_18z88z8ldni83zq.R.inc(11967);final int upv = mulAndCheck(fraction.numerator, denominator);
            __CLR4_4_18z88z8ldni83zq.R.inc(11968);return new Fraction
                ((((isAdd )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11969)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11970)==0&false))? addAndCheck(uvp, upv) : subAndCheck(uvp, upv),
                 mulPosAndCheck(denominator, fraction.denominator));
        }
        // the quantity 't' requires 65 bits of precision; see knuth 4.5.1
        // exercise 7.  we're going to use a BigInteger.
        // t = u(v'/d1) +/- v(u'/d1)
        }__CLR4_4_18z88z8ldni83zq.R.inc(11971);final BigInteger uvp = BigInteger.valueOf(numerator)
            .multiply(BigInteger.valueOf(fraction.denominator/d1));
        __CLR4_4_18z88z8ldni83zq.R.inc(11972);final BigInteger upv = BigInteger.valueOf(fraction.numerator)
            .multiply(BigInteger.valueOf(denominator/d1));
        __CLR4_4_18z88z8ldni83zq.R.inc(11973);final BigInteger t = (((isAdd )&&(__CLR4_4_18z88z8ldni83zq.R.iget(11974)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11975)==0&false))? uvp.add(upv) : uvp.subtract(upv);
        // but d2 doesn't need extra precision because
        // d2 = gcd(t,d1) = gcd(t mod d1, d1)
        __CLR4_4_18z88z8ldni83zq.R.inc(11976);final int tmodd1 = t.mod(BigInteger.valueOf(d1)).intValue();
        __CLR4_4_18z88z8ldni83zq.R.inc(11977);final int d2 = (((tmodd1==0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11978)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11979)==0&false))?d1:greatestCommonDivisor(tmodd1, d1);

        // result is (t/d2) / (u'/d1)(v'/d2)
        __CLR4_4_18z88z8ldni83zq.R.inc(11980);final BigInteger w = t.divide(BigInteger.valueOf(d2));
        __CLR4_4_18z88z8ldni83zq.R.inc(11981);if ((((w.bitLength() > 31)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11982)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11983)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11984);throw new ArithmeticException
                ("overflow: numerator too large after multiply");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11985);return new Fraction
            (w.intValue(),
             mulPosAndCheck(denominator/d1, fraction.denominator/d2));
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Multiplies the value of this fraction by another, returning the 
     * result in reduced form.</p>
     *
     * @param fraction  the fraction to multiply by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction multiplyBy(final Fraction fraction) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11986);
        __CLR4_4_18z88z8ldni83zq.R.inc(11987);if ((((fraction == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11988)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11989)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11990);throw new IllegalArgumentException("The fraction must not be null");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(11991);if ((((numerator == 0 || fraction.numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(11992)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(11993)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(11994);return ZERO;
        }
        // knuth 4.5.1
        // make sure we don't overflow unless the result *must* overflow.
        }__CLR4_4_18z88z8ldni83zq.R.inc(11995);final int d1 = greatestCommonDivisor(numerator, fraction.denominator);
        __CLR4_4_18z88z8ldni83zq.R.inc(11996);final int d2 = greatestCommonDivisor(fraction.numerator, denominator);
        __CLR4_4_18z88z8ldni83zq.R.inc(11997);return getReducedFraction
            (mulAndCheck(numerator/d1, fraction.numerator/d2),
             mulPosAndCheck(denominator/d2, fraction.denominator/d1));
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Divide the value of this fraction by another.</p>
     *
     * @param fraction  the fraction to divide by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the fraction to divide by is zero
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction divideBy(final Fraction fraction) {try{__CLR4_4_18z88z8ldni83zq.R.inc(11998);
        __CLR4_4_18z88z8ldni83zq.R.inc(11999);if ((((fraction == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12000)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12001)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12002);throw new IllegalArgumentException("The fraction must not be null");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12003);if ((((fraction.numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12004)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12005)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12006);throw new ArithmeticException("The fraction to divide by must not be zero");
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12007);return multiplyBy(fraction.invert());
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    // Basics
    //-------------------------------------------------------------------

    /**
     * <p>Compares this fraction to another object to test if they are equal.</p>.
     *
     * <p>To be equal, both values must be equal. Thus 2/4 is not equal to 1/2.</p>
     *
     * @param obj the reference object with which to compare
     * @return <code>true</code> if this object is equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_18z88z8ldni83zq.R.inc(12008);
        __CLR4_4_18z88z8ldni83zq.R.inc(12009);if ((((obj == this)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12010)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12011)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12012);return true;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12013);if ((((obj instanceof Fraction == false)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12014)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12015)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12016);return false;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12017);final Fraction other = (Fraction) obj;
        __CLR4_4_18z88z8ldni83zq.R.inc(12018);return getNumerator() == other.getNumerator() &&
                getDenominator() == other.getDenominator();
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets a hashCode for the fraction.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_18z88z8ldni83zq.R.inc(12019);
        __CLR4_4_18z88z8ldni83zq.R.inc(12020);if ((((hashCode == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12021)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12022)==0&false))) {{
            // hashcode update should be atomic.
            __CLR4_4_18z88z8ldni83zq.R.inc(12023);hashCode = 37 * (37 * 17 + getNumerator()) + getDenominator();
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12024);return hashCode;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Compares this object to another based on size.</p>
     *
     * <p>Note: this class has a natural ordering that is inconsistent
     * with equals, because, for example, equals treats 1/2 and 2/4 as
     * different, whereas compareTo treats them as equal.
     *
     * @param other  the object to compare to
     * @return -1 if this is less, 0 if equal, +1 if greater
     * @throws ClassCastException if the object is not a <code>Fraction</code>
     * @throws NullPointerException if the object is <code>null</code>
     */
    @Override
    public int compareTo(final Fraction other) {try{__CLR4_4_18z88z8ldni83zq.R.inc(12025);
        __CLR4_4_18z88z8ldni83zq.R.inc(12026);if ((((this==other)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12027)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12028)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12029);return 0;
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12030);if ((((numerator == other.numerator && denominator == other.denominator)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12031)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12032)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12033);return 0;
        }

        // otherwise see which is less
        }__CLR4_4_18z88z8ldni83zq.R.inc(12034);final long first = (long) numerator * (long) other.denominator;
        __CLR4_4_18z88z8ldni83zq.R.inc(12035);final long second = (long) other.numerator * (long) denominator;
        __CLR4_4_18z88z8ldni83zq.R.inc(12036);if ((((first == second)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12037)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12038)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12039);return 0;
        } }else {__CLR4_4_18z88z8ldni83zq.R.inc(12040);if ((((first < second)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12041)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12042)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12043);return -1;
        } }else {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12044);return 1;
        }
    }}}finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>String</code>.</p>
     *
     * <p>The format used is '<i>numerator</i>/<i>denominator</i>' always.
     *
     * @return a <code>String</code> form of the fraction
     */
    @Override
    public String toString() {try{__CLR4_4_18z88z8ldni83zq.R.inc(12045);
        __CLR4_4_18z88z8ldni83zq.R.inc(12046);if ((((toString == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12047)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12048)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12049);toString = new StringBuilder(32)
                .append(getNumerator())
                .append('/')
                .append(getDenominator()).toString();
        }
        }__CLR4_4_18z88z8ldni83zq.R.inc(12050);return toString;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a proper <code>String</code> in the format X Y/Z.</p>
     *
     * <p>The format used in '<i>wholeNumber</i> <i>numerator</i>/<i>denominator</i>'.
     * If the whole number is zero it will be omitted. If the numerator is zero,
     * only the whole number is returned.</p>
     *
     * @return a <code>String</code> form of the fraction
     */
    public String toProperString() {try{__CLR4_4_18z88z8ldni83zq.R.inc(12051);
        __CLR4_4_18z88z8ldni83zq.R.inc(12052);if ((((toProperString == null)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12053)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12054)==0&false))) {{
            __CLR4_4_18z88z8ldni83zq.R.inc(12055);if ((((numerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12056)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12057)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(12058);toProperString = "0";
            } }else {__CLR4_4_18z88z8ldni83zq.R.inc(12059);if ((((numerator == denominator)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12060)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12061)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(12062);toProperString = "1";
            } }else {__CLR4_4_18z88z8ldni83zq.R.inc(12063);if ((((numerator == -1 * denominator)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12064)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12065)==0&false))) {{
                __CLR4_4_18z88z8ldni83zq.R.inc(12066);toProperString = "-1";
            } }else {__CLR4_4_18z88z8ldni83zq.R.inc(12067);if ((((((((numerator>0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12068)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12069)==0&false))?-numerator:numerator) < -denominator)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12070)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12071)==0&false))) {{
                // note that we do the magnitude comparison test above with
                // NEGATIVE (not positive) numbers, since negative numbers
                // have a larger range.  otherwise numerator==Integer.MIN_VALUE
                // is handled incorrectly.
                __CLR4_4_18z88z8ldni83zq.R.inc(12072);final int properNumerator = getProperNumerator();
                __CLR4_4_18z88z8ldni83zq.R.inc(12073);if ((((properNumerator == 0)&&(__CLR4_4_18z88z8ldni83zq.R.iget(12074)!=0|true))||(__CLR4_4_18z88z8ldni83zq.R.iget(12075)==0&false))) {{
                    __CLR4_4_18z88z8ldni83zq.R.inc(12076);toProperString = Integer.toString(getProperWhole());
                } }else {{
                    __CLR4_4_18z88z8ldni83zq.R.inc(12077);toProperString = new StringBuilder(32)
                        .append(getProperWhole()).append(' ')
                        .append(properNumerator).append('/')
                        .append(getDenominator()).toString();
                }
            }} }else {{
                __CLR4_4_18z88z8ldni83zq.R.inc(12078);toProperString = new StringBuilder(32)
                    .append(getNumerator()).append('/')
                    .append(getDenominator()).toString();
            }
        }}}}}
        }__CLR4_4_18z88z8ldni83zq.R.inc(12079);return toProperString;
    }finally{__CLR4_4_18z88z8ldni83zq.R.flushNeeded();}}
}
