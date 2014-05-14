/*
 * Copyright (C) 2014 Francesco Azzola
 *  Surviving with Android (http://www.survivingwithandroid.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.survivingwithandroid.weather.lib.exception;

/*
* This exception is raised when the weather client can't find the right Location provider according to
*
* {@link SearchCriteria} selected
*
* @author Francesco Azzola
* */
public class LocationProviderNotFoundException extends Exception {

    public LocationProviderNotFoundException() {
    }

    public LocationProviderNotFoundException(String detailMessage) {
        super(detailMessage);
    }

    public LocationProviderNotFoundException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public LocationProviderNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
