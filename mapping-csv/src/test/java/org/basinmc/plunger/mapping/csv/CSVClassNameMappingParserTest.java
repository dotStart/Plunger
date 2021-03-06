/*
 * Copyright 2018 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.basinmc.plunger.mapping.csv;

import java.io.IOException;
import java.io.InputStream;
import org.basinmc.plunger.mapping.ClassNameMapping;
import org.junit.Assert;
import org.junit.Test;

/**
 * Evaluates whether the {@link CSVClassNameMappingParser} operates as expected.
 *
 * @author <a href="mailto:johannesd@torchmind.com">Johannes Donath</a>
 */
public class CSVClassNameMappingParserTest {

  /**
   * Evaluates whether the parser is capable of correctly parsing standard CSV files and turning
   * them into class name mappings.
   */
  @Test
  public void testMap() throws IOException {
    CSVClassNameMappingParser parser = CSVClassNameMappingParser.builder()
        .build("original", "target");

    try (InputStream inputStream = this.getClass().getResourceAsStream("/ClassMapping.csv")) {
      ClassNameMapping mapping = parser.parse(inputStream);

      String result = mapping.getClassName("org/basinmc/plunger/test/TestClass")
          .orElseThrow(() -> new AssertionError("Expected a mapping but got an empty optional"));
      Assert.assertEquals("org/basinmc/plunger/mapped/test/MappedTestClass", result);

      Assert.assertFalse(mapping.getClassName("java/lang/Object").isPresent());
    }
  }
}
