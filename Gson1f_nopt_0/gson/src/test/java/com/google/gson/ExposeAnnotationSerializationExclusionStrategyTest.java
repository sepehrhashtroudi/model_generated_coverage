/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import java.lang.reflect.Field;

import junit.framework.TestCase;

import com.google.gson.annotations.Expose;

/**
 * Unit tests for the {@link ExposeAnnotationSerializationExclusionStrategy} class.
 *
 * @author Joel Leitch
 */
public class ExposeAnnotationSerializationExclusionStrategyTest extends TestCase {
  private ExposeAnnotationSerializationExclusionStrategy strategy;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    strategy = new ExposeAnnotationSerializationExclusionStrategy();
  }

  

  

  

  

  

  @SuppressWarnings("unused")
  private static class MockObject {
    @Expose
    public final int exposedField = 0;

    @Expose(serialize=true)
    public final int explicitlyExposedField = 0;

    @Expose(serialize=false)
    public final int explicitlyHiddenField = 0;

    public final int hiddenField = 0;
  }
}
