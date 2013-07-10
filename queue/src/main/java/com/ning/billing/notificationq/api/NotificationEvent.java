/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.notificationq.api;

import com.ning.billing.queue.api.QueueEvent;

/**
 * The interface that needs to be implemented for any notification event
 * <p/>
 * <p> The user specific class implementing this interface must also be serializable in json using jackson annotations.
 * The generated JSON must also fit in the varchar as defined by the schema
 */

public interface NotificationEvent extends QueueEvent {
}
