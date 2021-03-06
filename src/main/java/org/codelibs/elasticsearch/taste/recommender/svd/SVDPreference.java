/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codelibs.elasticsearch.taste.recommender.svd;

import org.codelibs.elasticsearch.taste.model.GenericPreference;

import com.google.common.base.Preconditions;

final class SVDPreference extends GenericPreference {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private double cache;

    SVDPreference(final long userID, final long itemID, final float value,
            final double cache) {
        super(userID, itemID, value);
        setCache(cache);
    }

    public double getCache() {
        return cache;
    }

    public void setCache(final double value) {
        Preconditions.checkArgument(!Double.isNaN(value), "NaN cache value");
        cache = value;
    }

}
