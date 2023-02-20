/*
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
package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - StartsWith/EndsWith methods
 *
 * @version $Id$
 */
public class StringUtilsStartsEndsWithTest {
    private static final String foo    = "foo";
    private static final String bar    = "bar";
    private static final String foobar = "foobar";
    private static final String FOO    = "FOO";
    private static final String BAR    = "BAR";
    private static final String FOOBAR = "FOOBAR";

    //-----------------------------------------------------------------------

    /**
     * Test StringUtils.startsWith()
     */
@Test
public void testEndsWithAny_StringStringArray574() { 
     assertFalse(StringUtils.endsWithAny(null, (CharSequence) null)); 
     assertFalse(StringUtils.endsWithAny(null, "")); 
     assertFalse(StringUtils.endsWithAny(null, "ab")); 
     assertFalse(StringUtils.endsWithAny("", (CharSequence) null)); 
     assertFalse(StringUtils.endsWithAny("", "")); 
     assertFalse(StringUtils.endsWithAny("", "ab")); 
     assertFalse(StringUtils.endsWithAny("zzabyycdxx", (CharSequence) null)); 
     assertFalse(StringUtils.endsWithAny("zzabyycdxx", "")); 
     assertTrue(StringUtils.endsWithAny("zzabyycdxx", "za")); 
     assertTrue(StringUtils.endsWithAny("zzabyycdxx", "by")); 
     assertFalse(StringUtils.endsWithAny("ab", "z")); 
 }
    

    /**
     * Test StringUtils.testStartsWithIgnoreCase()
     */
    

    
 

    /**
     * Test StringUtils.endsWith()
     */
    

    /**
     * Test StringUtils.endsWithIgnoreCase()
     */
    

    


}
