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
package org.basinmc.plunger.sourcecode;

import edu.umd.cs.findbugs.annotations.NonNull;
import org.basinmc.plunger.sourcecode.formatter.GoogleSourcecodeFormatter;

/**
 * Switches CRLF with LF line endings.
 *
 * @author <a href="mailto:johannesd@torchmind.com">Johannes Donath</a>
 */
public class TestSourcecodeFormatter extends GoogleSourcecodeFormatter {

  /**
   * {@inheritDoc}
   */
  @NonNull
  @Override
  public String format(@NonNull String source) {
    return super.format(source).replace("\r", "");
  }
}
