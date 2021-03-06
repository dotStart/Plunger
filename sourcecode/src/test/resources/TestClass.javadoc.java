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
package org.basinmc.plunger.test;

/** Test Documentation */
public class TestClass {

  /** Test Field Documentation */
  private final int testField = 21;

  /** Test Constructor Documentation */
  private TestClass(String value) {
    System.out.println(value);
  }

  /** Test Method Documentation */
  public int testMethod() {
    return 42;
  }

  public static void main(String[] arguments) {
    TestClass test = new TestClass(arguments.length >= 1 ? arguments[0] : "None");
    System.out.println("testField = " + test.testField);
    System.out.println("testMethod() = " + test.testMethod());
  }
}
