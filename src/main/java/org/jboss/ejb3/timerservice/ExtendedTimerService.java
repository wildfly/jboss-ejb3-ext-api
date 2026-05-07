/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2026 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
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
package org.jboss.ejb3.timerservice;

import java.util.Collection;

import jakarta.ejb.Timer;
import jakarta.ejb.TimerService;

/**
 * WildFly specific extension of {@link TimerService} that allows querying
 * EJB timers by their external identifier.
 *
 * @author Tomasz Adamski
 */
public interface ExtendedTimerService extends TimerService {

    /**
     * Returns all active timers associated with the specified external identifier.
     *
     * @param externalId the external identifier to search for
     * @return a collection of active timers, or an empty list if none are found
     */
    Collection<Timer> getTimersByExternalId(String externalId);
}
