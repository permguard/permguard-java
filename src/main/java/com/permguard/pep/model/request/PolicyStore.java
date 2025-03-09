/**
 *   Copyright 2024 Nitro Agility S.r.l.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
  */

package com.permguard.pep.model.request;

/**
 * Represents a policy store where policies are maintained.
 * It includes the type of policy store and its identifier.
 */
public class PolicyStore {
    private String type;
    private String id;

    /**
     * Default conMap<String, Object>or.
     */
    public PolicyStore() {
    }

    /**
     * ConMap<String, Object>or with parameters.
     *
     * @param type The type of the policy store.
     * @param id   The identifier of the policy store.
     */
    public PolicyStore(String type, String id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Gets the policy store type.
     *
     * @return The type of the policy store.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the policy store type.
     *
     * @param type The type of the policy store.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the policy store ID.
     *
     * @return The ID of the policy store.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the policy store ID.
     *
     * @param id The ID of the policy store.
     */
    public void setId(String id) {
        this.id = id;
    }
}
