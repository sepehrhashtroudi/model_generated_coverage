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

package org.apache.commons.codec.language;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.StringEncoderAbstractTest;

/**
 * Tests RefinedSoundex.
 * 
 * @author Apache Software Foundation
 * @version $Id$
 */
public class RefinedSoundexTest extends StringEncoderAbstractTest {

    public static Test suite() {
        return new TestSuite(RefinedSoundexTest.class);
    }

    private RefinedSoundex encoder = null;

    public RefinedSoundexTest(String name) {
        super(name);
    }

    /**
	 * @return Returns the encoder.
	 */
    private RefinedSoundex getEncoder() {
        return this.encoder;
    }

    protected StringEncoder makeEncoder() {
        return new RefinedSoundex();
    }

    /**
	 * @param encoder
	 *                  The encoder to set.
	 */
    private void setEncoder(RefinedSoundex encoder) {
        this.encoder = encoder;
    }

    public void setUp() throws Exception {
        super.setUp();
        this.setEncoder(new RefinedSoundex());
    }

    public void tearDown() throws Exception {
        super.tearDown();
        this.setEncoder(null);
    }

    

    

	
}
