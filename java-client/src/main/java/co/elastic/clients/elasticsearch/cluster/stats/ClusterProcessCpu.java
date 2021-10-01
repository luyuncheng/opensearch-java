/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterProcessCpu
@JsonpDeserializable
public final class ClusterProcessCpu implements JsonpSerializable {
	private final int percent;

	// ---------------------------------------------------------------------------------------------

	public ClusterProcessCpu(Builder builder) {

		this.percent = Objects.requireNonNull(builder.percent, "percent");

	}

	public ClusterProcessCpu(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code percent}
	 */
	public int percent() {
		return this.percent;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("percent");
		generator.write(this.percent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcessCpu}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcessCpu> {
		private Integer percent;

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(int value) {
			this.percent = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterProcessCpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcessCpu build() {

			return new ClusterProcessCpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcessCpu}
	 */
	public static final JsonpDeserializer<ClusterProcessCpu> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterProcessCpu::setupClusterProcessCpuDeserializer, Builder::build);

	protected static void setupClusterProcessCpuDeserializer(DelegatingDeserializer<ClusterProcessCpu.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.integerDeserializer(), "percent");

	}

}