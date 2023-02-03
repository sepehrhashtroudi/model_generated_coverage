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

package org.apache.commons.lang3.text;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Test class for StrSubstitutor.
 *
 * @version $Id$
 */
public class StrSubstitutorTest {static class __CLR4_4_1g44g44ldniggzl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g44g44ldniggzl.R.inc(20884);
        __CLR4_4_1g44g44ldniggzl.R.inc(20885);values = new HashMap<String, String>();
        __CLR4_4_1g44g44ldniggzl.R.inc(20886);values.put("animal", "quick brown fox");
        __CLR4_4_1g44g44ldniggzl.R.inc(20887);values.put("target", "lazy dog");
    }finally{__CLR4_4_1g44g44ldniggzl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1g44g44ldniggzl.R.inc(20888);
        __CLR4_4_1g44g44ldniggzl.R.inc(20889);values = null;
    }finally{__CLR4_4_1g44g44ldniggzl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests replace with no variables.
     */
    

    /**
     * Tests replace with null.
     */
    

    /**
     * Tests replace with null.
     */
    

    /**
     * Tests key replace changing map after initialization (not recommended).
     */
    

    /**
     * Tests unknown key replace.
     */
    

    /**
     * Tests adjacent keys.
     */
    

    /**
     * Tests adjacent keys.
     */
    

    /**
     * Tests simple recursive replace.
     */
    

    /**
     * Tests escaping.
     */
    

    /**
     * Tests escaping.
     */
    

    /**
     * Tests complex escaping.
     */
    

    /**
     * Tests when no prefix or suffix.
     */
    

    /**
     * Tests when no incomplete prefix.
     */
    

    /**
     * Tests when prefix but no suffix.
     */
    

    /**
     * Tests when suffix but no prefix.
     */
    

    /**
     * Tests when no variable name.
     */
    

    /**
     * Tests replace creates output same as input.
     */
    

    /**
     * Tests a cyclic replace operation.
     * The cycle should be detected and cause an exception to be thrown.
     */
    

    /**
     * Tests interpolation with weird boundary patterns.
     */
    

    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests whether a variable can be replaced in a variable name.
     */
    

    /**
     * Tests whether substitution in variable names is disabled per default.
     */
    

    /**
     * Tests complex and recursive substitution in variable names.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests protected.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests constructor.
     */
    

    /**
     * Tests constructor.
     */
    

    /**
     * Tests constructor.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests get set.
     */
    

    /**
     * Tests get set.
     */
    

    /**
     * Tests get set.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests static.
     */
    

    /**
     * Tests static.
     */
    

    /**
     * Tests interpolation with system properties.
     */
    

    /**
     * Test the replace of a properties object
     */
    
    
    

    //-----------------------------------------------------------------------
    private void doTestReplace(final String expectedResult, final String replaceTemplate, final boolean substring) {try{__CLR4_4_1g44g44ldniggzl.R.inc(20890);
        __CLR4_4_1g44g44ldniggzl.R.inc(20891);final String expectedShortResult = expectedResult.substring(1, expectedResult.length() - 1);
        __CLR4_4_1g44g44ldniggzl.R.inc(20892);final StrSubstitutor sub = new StrSubstitutor(values);

        // replace using String
        __CLR4_4_1g44g44ldniggzl.R.inc(20893);assertEquals(expectedResult, sub.replace(replaceTemplate));
        __CLR4_4_1g44g44ldniggzl.R.inc(20894);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20895)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20896)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20897);assertEquals(expectedShortResult, sub.replace(replaceTemplate, 1, replaceTemplate.length() - 2));
        }

        // replace using char[]
        }__CLR4_4_1g44g44ldniggzl.R.inc(20898);final char[] chars = replaceTemplate.toCharArray();
        __CLR4_4_1g44g44ldniggzl.R.inc(20899);assertEquals(expectedResult, sub.replace(chars));
        __CLR4_4_1g44g44ldniggzl.R.inc(20900);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20901)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20902)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20903);assertEquals(expectedShortResult, sub.replace(chars, 1, chars.length - 2));
        }

        // replace using StringBuffer
        }__CLR4_4_1g44g44ldniggzl.R.inc(20904);StringBuffer buf = new StringBuffer(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20905);assertEquals(expectedResult, sub.replace(buf));
        __CLR4_4_1g44g44ldniggzl.R.inc(20906);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20907)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20908)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20909);assertEquals(expectedShortResult, sub.replace(buf, 1, buf.length() - 2));
        }

        // replace using StringBuilder
        }__CLR4_4_1g44g44ldniggzl.R.inc(20910);StringBuilder builder = new StringBuilder(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20911);assertEquals(expectedResult, sub.replace(builder));
        __CLR4_4_1g44g44ldniggzl.R.inc(20912);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20913)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20914)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20915);assertEquals(expectedShortResult, sub.replace(builder, 1, builder.length() - 2));
        }
        
        // replace using StrBuilder
        }__CLR4_4_1g44g44ldniggzl.R.inc(20916);StrBuilder bld = new StrBuilder(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20917);assertEquals(expectedResult, sub.replace(bld));
        __CLR4_4_1g44g44ldniggzl.R.inc(20918);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20919)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20920)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20921);assertEquals(expectedShortResult, sub.replace(bld, 1, bld.length() - 2));
        }

        // replace using object
        }__CLR4_4_1g44g44ldniggzl.R.inc(20922);final MutableObject<String> obj = new MutableObject<String>(replaceTemplate);  // toString returns template
        __CLR4_4_1g44g44ldniggzl.R.inc(20923);assertEquals(expectedResult, sub.replace(obj));

        // replace in StringBuffer
        __CLR4_4_1g44g44ldniggzl.R.inc(20924);buf = new StringBuffer(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20925);assertTrue(sub.replaceIn(buf));
        __CLR4_4_1g44g44ldniggzl.R.inc(20926);assertEquals(expectedResult, buf.toString());
        __CLR4_4_1g44g44ldniggzl.R.inc(20927);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20928)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20929)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20930);buf = new StringBuffer(replaceTemplate);
            __CLR4_4_1g44g44ldniggzl.R.inc(20931);assertTrue(sub.replaceIn(buf, 1, buf.length() - 2));
            __CLR4_4_1g44g44ldniggzl.R.inc(20932);assertEquals(expectedResult, buf.toString());  // expect full result as remainder is untouched
        }

        // replace in StringBuilder
        }__CLR4_4_1g44g44ldniggzl.R.inc(20933);builder = new StringBuilder(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20934);assertTrue(sub.replaceIn(builder));
        __CLR4_4_1g44g44ldniggzl.R.inc(20935);assertEquals(expectedResult, builder.toString());
        __CLR4_4_1g44g44ldniggzl.R.inc(20936);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20937)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20938)==0&false))) {{
        	__CLR4_4_1g44g44ldniggzl.R.inc(20939);builder = new StringBuilder(replaceTemplate);
            __CLR4_4_1g44g44ldniggzl.R.inc(20940);assertTrue(sub.replaceIn(builder, 1, builder.length() - 2));
            __CLR4_4_1g44g44ldniggzl.R.inc(20941);assertEquals(expectedResult, builder.toString());  // expect full result as remainder is untouched
        }
        
        // replace in StrBuilder
        }__CLR4_4_1g44g44ldniggzl.R.inc(20942);bld = new StrBuilder(replaceTemplate);
        __CLR4_4_1g44g44ldniggzl.R.inc(20943);assertTrue(sub.replaceIn(bld));
        __CLR4_4_1g44g44ldniggzl.R.inc(20944);assertEquals(expectedResult, bld.toString());
        __CLR4_4_1g44g44ldniggzl.R.inc(20945);if ((((substring)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20946)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20947)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20948);bld = new StrBuilder(replaceTemplate);
            __CLR4_4_1g44g44ldniggzl.R.inc(20949);assertTrue(sub.replaceIn(bld, 1, bld.length() - 2));
            __CLR4_4_1g44g44ldniggzl.R.inc(20950);assertEquals(expectedResult, bld.toString());  // expect full result as remainder is untouched
        }
    }}finally{__CLR4_4_1g44g44ldniggzl.R.flushNeeded();}}

    private void doTestNoReplace(final String replaceTemplate) {try{__CLR4_4_1g44g44ldniggzl.R.inc(20951);
        __CLR4_4_1g44g44ldniggzl.R.inc(20952);final StrSubstitutor sub = new StrSubstitutor(values);

        __CLR4_4_1g44g44ldniggzl.R.inc(20953);if ((((replaceTemplate == null)&&(__CLR4_4_1g44g44ldniggzl.R.iget(20954)!=0|true))||(__CLR4_4_1g44g44ldniggzl.R.iget(20955)==0&false))) {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20956);assertEquals(null, sub.replace((String) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20957);assertEquals(null, sub.replace((String) null, 0, 100));
            __CLR4_4_1g44g44ldniggzl.R.inc(20958);assertEquals(null, sub.replace((char[]) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20959);assertEquals(null, sub.replace((char[]) null, 0, 100));
            __CLR4_4_1g44g44ldniggzl.R.inc(20960);assertEquals(null, sub.replace((StringBuffer) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20961);assertEquals(null, sub.replace((StringBuffer) null, 0, 100));
            __CLR4_4_1g44g44ldniggzl.R.inc(20962);assertEquals(null, sub.replace((StrBuilder) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20963);assertEquals(null, sub.replace((StrBuilder) null, 0, 100));
            __CLR4_4_1g44g44ldniggzl.R.inc(20964);assertEquals(null, sub.replace((Object) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20965);assertFalse(sub.replaceIn((StringBuffer) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20966);assertFalse(sub.replaceIn((StringBuffer) null, 0, 100));
            __CLR4_4_1g44g44ldniggzl.R.inc(20967);assertFalse(sub.replaceIn((StrBuilder) null));
            __CLR4_4_1g44g44ldniggzl.R.inc(20968);assertFalse(sub.replaceIn((StrBuilder) null, 0, 100));
        } }else {{
            __CLR4_4_1g44g44ldniggzl.R.inc(20969);assertEquals(replaceTemplate, sub.replace(replaceTemplate));
            __CLR4_4_1g44g44ldniggzl.R.inc(20970);final StrBuilder bld = new StrBuilder(replaceTemplate);
            __CLR4_4_1g44g44ldniggzl.R.inc(20971);assertFalse(sub.replaceIn(bld));
            __CLR4_4_1g44g44ldniggzl.R.inc(20972);assertEquals(replaceTemplate, bld.toString());
        }
    }}finally{__CLR4_4_1g44g44ldniggzl.R.flushNeeded();}}

}
