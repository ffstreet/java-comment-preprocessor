/* 
 * Copyright 2014 Igor Maznitsa (http://www.igormaznitsa.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.igormaznitsa.jcp.expression;

import org.junit.Test;
import static org.junit.Assert.*;
import com.igormaznitsa.jcp.AbstractSpyPreprocessorContextTest;

public class ExpressionTest extends AbstractSpyPreprocessorContextTest {

  @Test
  public void testSimpleExpression() throws Exception {
    assertEquals("Must be equal", Value.INT_TWO, Expression.evalExpression("40/4-2*4", preparePreprocessorContext(getCurrentTestFolder())));
  }
}
