/*
 * Copyright 2019, OpenTelemetry Authors
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

package io.opentelemetry.metrics;

import io.opentelemetry.metrics.InstrumentWithBinding.BoundInstrument;
import javax.annotation.concurrent.ThreadSafe;

/**
 * Base interface for all the Measure instruments.
 *
 * @param <H> the Bound Instrument type.
 * @since 0.1.0
 */
@ThreadSafe
public interface Measure<H extends BoundInstrument> extends InstrumentWithBinding<H> {

  /** Builder class for {@link Measure}. */
  interface Builder<B extends Measure.Builder<B, V>, V> extends Instrument.Builder<B, V> {
    /**
     * Sets the absolute property for this {@code Builder}. If {@code true} only positive values are
     * expected.
     *
     * <p>Default value is {@code true}
     *
     * @param absolute {@code true} only positive values are expected.
     * @return this.
     */
    B setAbsolute(boolean absolute);
  }
}
