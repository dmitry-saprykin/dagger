# Copyright (C) 2017 The Dagger Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Description:
#   A library for javac the javac plugin module.

package(default_visibility = ["//:src"])

java_library(
    name = "javac",
    srcs = glob(["*.java"]),
    plugins = ["//java/dagger/internal/codegen:component-codegen"],
    exports = [
        ":javac-import",
    ],
    deps = [
        ":javac-import",
        "//java/dagger:core",
        "//java/dagger/internal/codegen/binding",
        "//java/dagger/internal/codegen/compileroption",
        "//java/dagger/internal/codegen/langmodel",
    ],
)

# buildifier: disable=no-effect
# Replacement for @bazel_tools//third_party/java/jdk/langtools:javac, which seems to have gone away?
java_import(
    name = "javac-import",
    jars = ["@bazel_tools//third_party/java/jdk/langtools:javac_jar"],
)