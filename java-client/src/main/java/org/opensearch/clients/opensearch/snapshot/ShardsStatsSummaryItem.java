/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.snapshot;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.Long;
import java.util.function.Function;

// typedef: snapshot._types.ShardsStatsSummaryItem
@JsonpDeserializable
public class ShardsStatsSummaryItem implements JsonpSerializable {
	private final long fileCount;

	private final long sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private ShardsStatsSummaryItem(Builder builder) {

		this.fileCount = ModelTypeHelper.requireNonNull(builder.fileCount, this, "fileCount");
		this.sizeInBytes = ModelTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");

	}

	public static ShardsStatsSummaryItem of(Function<Builder, ObjectBuilder<ShardsStatsSummaryItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code file_count}
	 */
	public final long fileCount() {
		return this.fileCount;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
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

		generator.writeKey("file_count");
		generator.write(this.fileCount);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStatsSummaryItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardsStatsSummaryItem> {
		private Long fileCount;

		private Long sizeInBytes;

		/**
		 * Required - API name: {@code file_count}
		 */
		public final Builder fileCount(long value) {
			this.fileCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsStatsSummaryItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStatsSummaryItem build() {
			_checkSingleUse();

			return new ShardsStatsSummaryItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStatsSummaryItem}
	 */
	public static final JsonpDeserializer<ShardsStatsSummaryItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsStatsSummaryItem::setupShardsStatsSummaryItemDeserializer, Builder::build);

	protected static void setupShardsStatsSummaryItemDeserializer(
			DelegatingDeserializer<ShardsStatsSummaryItem.Builder> op) {

		op.add(Builder::fileCount, JsonpDeserializer.longDeserializer(), "file_count");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

	}

}