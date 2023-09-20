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

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Annotation for specifying the transaction timeout of a newly started
 * transaction when invoking an EJB business method.
 *
 * @author <a href="mailto:bill.decoste@jboss.org">William DeCoste</a>
 */
@Target({METHOD, TYPE})
@Retention(RUNTIME)
public @interface TransactionTimeout {
    /**
     * The new timeout value, in seconds. If this parameter
     * is <code>0</code>, the timeout value is reset to the default
     * value.
     *
     * @see javax.transaction.TransactionManager#setTransactionTimeout(int)
     */
    long value() default 0;

    /**
     * Units used for the specified value. The minimum granularity is
     * <code>SECONDS</code>, specifying a lower one will result in a deployment
     * failure.
     * @since 2.0
     */
    TimeUnit unit() default TimeUnit.SECONDS;
}
