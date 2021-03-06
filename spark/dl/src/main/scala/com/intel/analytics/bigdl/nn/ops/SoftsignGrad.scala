/*
 * Copyright 2016 The BigDL Authors.
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
package com.intel.analytics.bigdl.nn.ops

import com.intel.analytics.bigdl.nn.SoftSign
import com.intel.analytics.bigdl.tensor.TensorNumericMath.TensorNumeric

import scala.reflect.ClassTag

class SoftsignGrad[T: ClassTag, D: ClassTag]
(implicit ev: TensorNumeric[T], ev2: TensorNumeric[D])
  extends UnaryGrad[T, D](true) {

  override val module: Module = SoftSign[T, D]()
}

object SoftsignGrad {
  def apply[T: ClassTag, D: ClassTag]()
     (implicit ev: TensorNumeric[T], ev2: TensorNumeric[D]): SoftsignGrad[T, D] =
    new SoftsignGrad[T, D]()
}
