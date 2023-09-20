/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2023 Red Hat, Inc., and individual contributors
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
package org.jboss.ejb3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adds the MDB to one or more delivery groups.
 * <br>
 *    In the case of a single delivery group,  the messages are delivered to the MDB only when the delivery group is active. If the
 * delivery group is not active, the messages will not be delivered until an administrator executes
 * a management operation on the MDB delivery group to activate it.
 * <br> For multiple delivery groups, this annotation is repeatable and can be used more than once in the same MDB.
 * If multiple delivery groups are specified, the messages are delivered to the MDB only when all specified delivery groups are active.
 *
 * @author Flavia Rainone
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DeliveryGroups.class)
public @interface DeliveryGroup {
   String value();
}
