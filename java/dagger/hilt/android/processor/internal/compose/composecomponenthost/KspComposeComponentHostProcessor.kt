/*
 * Copyright (C) 2023 The Dagger Authors.
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

package dagger.hilt.android.processor.internal.compose.composecomponenthost

import androidx.room.compiler.processing.ExperimentalProcessingApi
import com.google.auto.service.AutoService
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import dagger.hilt.processor.internal.KspBaseProcessingStepProcessor

/** Annotation processor for [dagger.hilt.android.compose.ComposeComponentHost]. */
class KspComposeComponentHostProcessor(
  environment: SymbolProcessorEnvironment,
) : KspBaseProcessingStepProcessor(environment) {

  @ExperimentalProcessingApi
  override protected fun processingStep() = ComposeComponentHostProcessingStep(xProcessingEnv)

  /** Provides the {@link KspComposeComponentHostProcessor}. */
  @AutoService(SymbolProcessorProvider::class)
  class Provider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment) =
        KspComposeComponentHostProcessor(environment)
  }
}
