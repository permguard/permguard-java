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

package com.permguard.pep.model.response;

/**
 * Represents the context included in an authorization response.
 * It contains additional details such as reasoning for admin and user.
 */
public class ContextResponse {
    private String id;
    private ReasonResponse reasonAdmin;
    private ReasonResponse reasonUser;

    /**
     * Default conMap<String, Object>or.
     */
    public ContextResponse() {
    }

    /**
     * ConMap<String, Object>or with parameters.
     *
     * @param id          The unique context ID.
     * @param reasonAdmin The reason for the decision provided to administrators.
     * @param reasonUser  The reason for the decision provided to users.
     */
    public ContextResponse(String id, ReasonResponse reasonAdmin, ReasonResponse reasonUser) {
        this.id = id;
        this.reasonAdmin = reasonAdmin;
        this.reasonUser = reasonUser;
    }

    /**
     * Gets the context ID.
     *
     * @return The context ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the context ID.
     *
     * @param id The context ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the admin reason response.
     *
     * @return The admin reason response.
     */
    public ReasonResponse getReasonAdmin() {
        return reasonAdmin;
    }

    /**
     * Sets the admin reason response.
     *
     * @param reasonAdmin The admin reason response.
     */
    public void setReasonAdmin(ReasonResponse reasonAdmin) {
        this.reasonAdmin = reasonAdmin;
    }

    /**
     * Gets the user reason response.
     *
     * @return The user reason response.
     */
    public ReasonResponse getReasonUser() {
        return reasonUser;
    }

    /**
     * Sets the user reason response.
     *
     * @param reasonUser The user reason response.
     */
    public void setReasonUser(ReasonResponse reasonUser) {
        this.reasonUser = reasonUser;
    }
}
