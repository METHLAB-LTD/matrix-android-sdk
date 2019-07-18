/*
 * Copyright 2014 OpenMarket Ltd
 * Copyright 2018 New Vector Ltd
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
package org.matrix.androidsdk.rest.model;

import org.matrix.androidsdk.core.interfaces.DatedObject;

public class ReceiptData implements java.io.Serializable, DatedObject {

    // the user id
    public String userId;

    // The event id.
    public String eventId;

    // The timestamp in ms since Epoch generated by the origin homeserver when it receives the event from the client.
    public long originServerTs;

    public ReceiptData(String anUserId, String anEventId, long aTs) {
        userId = anUserId;
        eventId = anEventId;
        originServerTs = aTs;
    }

    @Override
    public long getDate() {
        return originServerTs;
    }
}